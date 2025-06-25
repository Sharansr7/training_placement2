import json

def load_data():
    try:
        with open("students.json", "r") as f:
            return json.load(f)
    except FileNotFoundError:
        return []

def save_data(data):
    with open("students.json", "w") as f:
        json.dump(data, f, indent=4)

def add_student():
    students = load_data()
    student = {
        "name": input("Name: "),
        "roll": input("Roll No: "),
        "marks": int(input("Marks: "))
    }
    students.append(student)
    save_data(students)
    print("Student added.")

def view_students():
    students = load_data()
    for s in students:
        print(s)

def menu():
    while True:
        print("\n1. Add Student\n2. View Students\n3. Exit")
        choice = input("Choose: ")
        if choice == '1':
            add_student()
        elif choice == '2':
            view_students()
        else:
            break

menu()
