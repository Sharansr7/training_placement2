import requests

def convert(amount, from_curr, to_curr):
    url = f"https://api.exchangerate-api.com/v4/latest/{from_curr}"
    data = requests.get(url).json()
    rate = data['rates'][to_curr]
    print(f"{amount} {from_curr} = {amount * rate:.2f} {to_curr}")

amt = float(input("Amount: "))
f = input("From Currency (USD): ")
t = input("To Currency (INR): ")
convert(amt, f.upper(), t.upper())
