from tkinter import *

tasks = []

def add_task():
    task = task_input.get()
    if task != "":
        tasks.append(task)
        update_list()

def update_list():
    listbox.delete(0, END)
    for task in tasks:
        listbox.insert(END, task)

root = Tk()
root.title("To-Do List")

task_input = Entry(root, width=40)
task_input.pack(pady=5)

Button(root, text="Add Task", command=add_task).pack(pady=5)
listbox = Listbox(root, width=50)
listbox.pack()

root.mainloop()
