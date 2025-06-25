accounts = {}

def create_account():
    acc = input("Account Number: ")
    name = input("Name: ")
    accounts[acc] = {"name": name, "balance": 0}
    print("Account created.")

def deposit():
    acc = input("Account Number: ")
    amt = float(input("Amount to deposit: "))
    if acc in accounts:
        accounts[acc]["balance"] += amt
        print("Deposited.")
    else:
        print("Account not found.")

def show_balance():
    acc = input("Account Number: ")
    if acc in accounts:
        print(f"Balance: {accounts[acc]['balance']}")
    else:
        print("Account not found.")

def menu():
    while True:
        print("\n1. Create\n2. Deposit\n3. Show Balance\n4. Exit")
        ch = input("Choose: ")
        if ch == '1':
            create_account()
        elif ch == '2':
            deposit()
        elif ch == '3':
            show_balance()
        else:
            break

menu()
