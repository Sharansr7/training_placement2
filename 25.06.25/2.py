import json

INVENTORY_FILE = "inventory.json"

def load_inventory():
    try:
        with open(INVENTORY_FILE, "r") as f:
            return json.load(f)
    except FileNotFoundError:
        return {}

def save_inventory(data):
    with open(INVENTORY_FILE, "w") as f:
        json.dump(data, f, indent=4)

def add_item():
    inventory = load_inventory()
    item = input("Item name: ")
    qty = int(input("Quantity: "))
    inventory[item] = inventory.get(item, 0) + qty
    save_inventory(inventory)
    print("Item added.")

def view_inventory():
    inventory = load_inventory()
    for item, qty in inventory.items():
        print(f"{item}: {qty}")

def menu():
    while True:
        print("\n1. Add Item\n2. View Inventory\n3. Exit")
        ch = input("Choose: ")
        if ch == '1':
            add_item()
        elif ch == '2':
            view_inventory()
        else:
            break

menu()
