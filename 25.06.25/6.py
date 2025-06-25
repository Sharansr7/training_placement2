patients = []

def add_patient():
    p = {
        "ID": input("ID: "),
        "Name": input("Name: "),
        "Age": int(input("Age: ")),
        "Disease": input("Disease: ")
    }
    patients.append(p)

def view_patients():
    for p in patients:
        print(p)

def menu():
    while True:
        print("\n1. Add Patient\n2. View All\n3. Exit")
        ch = input("Choice: ")
        if ch == '1': add_patient()
        elif ch == '2': view_patients()
        else: break

menu()
