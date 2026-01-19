import requests
from bs4 import BeautifulSoup
import json
from notifier import send_whatsapp
from config import KEYWORDS

with open("seen.json", "r") as f:
    seen = set(json.load(f))

def save_seen():
    with open("seen.json", "w") as f:
        json.dump(list(seen), f)

def check_site(url):
    try:
        r = requests.get(url, timeout=10)
        soup = BeautifulSoup(r.text, "html.parser")

        links = soup.find_all("a", href=True)

        for link in links:
            title = link.get_text(strip=True).lower()
            href = link["href"]

            if any(k in title for k in KEYWORDS):
                if href not in seen:
                    seen.add(href)
                    send_whatsapp(title, href)

    except Exception as e:
        print(f"Error scraping {url}: {e}")

def main():
    with open("websites.txt") as f:
        sites = f.read().splitlines()

    for site in sites:
        check_site(site)

    save_seen()

if __name__ == "__main__":
    main()

