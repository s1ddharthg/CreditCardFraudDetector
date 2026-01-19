from twilio.rest import Client
from config import *

def send_whatsapp(title, link):
    msg = f"🚨 Case Comp Alert!\n\n{title}\n{link}"

    client = Client(TWILIO_SID, TWILIO_AUTH)
    client.messages.create(
        from_=WHATSAPP_FROM,
        to=WHATSAPP_TO,
        body=msg
    )
