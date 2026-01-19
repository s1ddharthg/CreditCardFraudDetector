import requests
from bs4 import BeautifulSoup
from config import KEYWORDS

def scrape_site(url):
    found = []
    r = requests.get(url, timeout=10)
    soup = BeautifulSoup(r.text, "html.parser")

    for a in soup.find_all("a", href=True):
        text = a.get_text(strip=True).lower()
        if any(k in text for k in KEYWORDS):
            found.append({
                "title": a.get_text(strip=True),
                "url": a["href"]
            })

    return found
