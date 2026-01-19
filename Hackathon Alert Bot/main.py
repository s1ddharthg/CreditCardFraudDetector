import json
from unstop import fetch_unstop
from generic_scraper import scrape_site
from notifier import notify

with open("seen.json") as f:
    seen = set(json.load(f))

def save():
    with open("seen.json", "w") as f:
        json.dump(list(seen), f)

def process(items):
    for item in items:
        if item["url"] not in seen:
            seen.add(item["url"])
            notify(item["title"], item["url"])

def main():
    process(fetch_unstop())

    with open("websites.txt") as f:
        for site in f.read().splitlines():
            if "unstop.com" not in site:
                process(scrape_site(site))

    save()

if __name__ == "__main__":
    main()
