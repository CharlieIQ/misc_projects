from tkinter import *
from tkinter import ttk
root = Tk()
frm = ttk.Frame(root, padding=10)
frm.grid()
ttk.Label(frm, text='Smoke Crack').grid(column=0,row=0)
ttk.Button(frm, text="Quit", command=root.destroy).grid(column=1, now=0)
root.mainloop()