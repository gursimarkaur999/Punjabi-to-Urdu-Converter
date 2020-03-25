# from tkinter import *
# from PIL import Image
# from PIL import ImageTk
#
#
# def motion(event):
#     # print("Mouse position: (%s %s)" % (event.x, event.y))
#
#     return
#
# def quit():
#     fade_away()
#
#
# def fade_away():
#     alpha = master.attributes("-alpha")
#     if alpha > 0:
#         alpha -= .1
#         master.attributes("-alpha", alpha)
#         master.after(100, fade_away)
#     else:
#         master.destroy()
#
#
# master = Tk()
# master.geometry("700x700")
# master.title("Highlight")
# frame = Frame(master)
# whatever_you_do = "Whatever you do will be insignificant, but it is very important that you do it.\n(Mahatma Gandhi)"
# msg = Message(frame, text=whatever_you_do)
# msg.config(bg='lightgreen', font=('times', 24, 'italic'))
# bill_c_image = Image.open("billcreate.png")
# bill_c_image = bill_c_image.resize((185, 200), Image.ANTIALIAS)
# bill_c_img = ImageTk.PhotoImage(bill_c_image)
# bill_create = Button(frame, bd=2, image=bill_c_img, padx=20)
# bill_create.config(width=200, height=200, cursor="hand2")
# bill_create.grid(row=1)
# bill_create.bind('<Motion>', fade_away)
# msg.grid(row=0)
# frame.pack()
# mainloop()
#

import tkinter
from tkinter import ttk

root = tkinter.Tk()

style = ttk.Style()
style.map("C.TButton",
    foreground=[('pressed', 'red'), ('active', 'blue')],
    background=[('pressed', '!disabled', 'black'), ('active', 'white')]
    )

colored_btn = ttk.Button(text="Test", style="C.TButton").pack()

root.mainloop()
