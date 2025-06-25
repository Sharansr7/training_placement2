from tkinter import *

def click(event):
    text = event.widget.cget("text")
    if text == "=":
        result.set(str(eval(entry.get())))
    elif text == "C":
        result.set("")
    else:
        result.set(entry.get() + text)

root = Tk()
root.title("Calculator")

result = StringVar()
entry = Entry(root, textvar=result, font="Arial 20")
entry.pack()

buttons = [
    ["7", "8", "9", "/"],
    ["4", "5", "6", "*"],
    ["1", "2", "3", "-"],
    ["C", "0", "=", "+"]
]

for row in buttons:
    f = Frame(root)
    f.pack()
    for b in row:
        Button(f, text=b, font="Arial 20", padx=20, pady=20).pack(side=LEFT, padx=5, pady=5).bind("<Button-1>", click)

root.mainloop()
