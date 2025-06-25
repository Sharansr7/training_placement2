import csv

def add_expense():
    with open("expenses.csv", "a", newline='') as file:
        writer = csv.writer(file)
        writer.writerow([input("Date: "), input("Category: "), input("Amount: ")])

def view_expenses():
    with open("expenses.csv", "r") as file:
        for row in csv.reader(file):
            print(row)

while True:
    print("\n1. Add Expense\n2. View All\n3. Exit")
    ch = input("Choice: ")
    if ch == '1': add_expense()
    elif ch == '2': view_expenses()
    else: break
