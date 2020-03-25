from tkinter import ttk
from tkinter import *
root = Tk()
billstree = ttk.Treeview(height=5, columns=('Item Code','Item Name', 'Qty', 'Unit Price', 'Discount %'
                                                          'SGST', 'CGST', 'IGST', 'Total Price'))
root.geometry("500x500")
billstree.column("#0", width=80, minwidth=80)
billstree.column("#1", width=150, minwidth=150)
billstree.column("#2", width=70, minwidth=70)
billstree.column("#3", width=60, minwidth=60)
billstree.column("#4", width=70, minwidth=70)
billstree.column("#5", width=50, minwidth=50)
billstree.column("#6", width=50, minwidth=50)
billstree.column("#7", width=50, minwidth=50)
billstree.column("#8", width=70, minwidth=70)
billstree.grid(row=0,column=0, columnspan=11)

billstree.heading('#0', text="Item Code")
billstree.heading('#1', text="Item Name")
billstree.heading('#2', text="Qty")
billstree.heading('#3', text="Unit Price")
billstree.heading('#4', text="Discount %")
billstree.heading('#5', text="SGST")
billstree.heading('#6', text="CGST")
billstree.heading('#7', text="IGST")
billstree.heading('#8', text="Total Price")


root.mainloop()
