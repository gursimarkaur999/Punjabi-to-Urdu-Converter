# # import tkinter as tk                # python 3
# # from tkinter import font  as tkfont # python 3
# # #import Tkinter as tk     # python 2
# # #import tkFont as tkfont  # python 2
# #
# # class SampleApp(tk.Tk):
# #
# #     def __init__(self, *args, **kwargs):
# #         tk.Tk.__init__(self, *args, **kwargs)
# #
# #         self.title_font = tkfont.Font(family='Helvetica', size=18, weight="bold", slant="italic")
# #
# #         # the container is where we'll stack a bunch of frames
# #         # on top of each other, then the one we want visible
# #         # will be raised above the others
# #         container = tk.Frame(self)
# #         container.pack(side="top", fill="both", expand=True)
# #         container.grid_rowconfigure(0, weight=1)
# #         container.grid_columnconfigure(0, weight=1)
# #
# #         self.frames = {}
# #         for F in (StartPage, PageOne, PageTwo):
# #             page_name = F.__name__
# #             frame = F(parent=container, controller=self)
# #             self.frames[page_name] = frame
# #
# #             # put all of the pages in the same location;
# #             # the one on the top of the stacking order
# #             # will be the one that is visible.
# #             frame.grid(row=0, column=0, sticky="nsew")
# #
# #         self.show_frame("StartPage")
# #
# #     def show_frame(self, page_name):
# #         '''Show a frame for the given page name'''
# #         frame = self.frames[page_name]
# #         frame.tkraise()
# #
# #
# # class StartPage(tk.Frame):
# #
# #     def __init__(self, parent, controller):
# #         tk.Frame.__init__(self, parent)
# #         self.controller = controller
# #         label = tk.Label(self, text="This is the start page", font=controller.title_font)
# #         label.pack(side="top", fill="x", pady=10)
# #
# #         button1 = tk.Button(self, text="Go to Page One",
# #                             command=lambda: controller.show_frame("PageOne"))
# #         button2 = tk.Button(self, text="Go to Page Two",
# #                             command=lambda: controller.show_frame("PageTwo"))
# #         button1.pack()
# #         button2.pack()
# #
# #
# # class PageOne(tk.Frame):
# #
# #     def __init__(self, parent, controller):
# #         tk.Frame.__init__(self, parent)
# #         self.controller = controller
# #         label = tk.Label(self, text="This is page 1", font=controller.title_font)
# #         label.pack(side="top", fill="x", pady=10)
# #         button = tk.Button(self, text="Go to the start page",
# #                            command=lambda: controller.show_frame("StartPage"))
# #         button.pack()
# #
# #
# # class PageTwo(tk.Frame):
# #
# #     def __init__(self, parent, controller):
# #         tk.Frame.__init__(self, parent)
# #         self.controller = controller
# #         label = tk.Label(self, text="This is page 2", font=controller.title_font)
# #         label.pack(side="top", fill="x", pady=10)
# #         button = tk.Button(self, text="Go to the start page",
# #                            command=lambda: controller.show_frame("StartPage"))
# #         button.pack()
# #
# #
# # if __name__ == "__main__":
# #     app = SampleApp()
# #     app.mainloop()
# #
# # from tkinter import *
# # from tkinter.ttk import Combobox, Style
# # from tkinter import ttk
# # from tkinter.font import Font
# # from tkinter import messagebox
# #
# #
# # class CustomerDetails:
# #
# #     def __init__(self):
# #         self.root = Tk()
# #         # style = Style()
# #         # style.configure(self.root, background="#333")
# #         self.root.geometry("{0}x{1}+0+0".format(self.root.winfo_screenwidth(), self.root.winfo_screenheight()))
# #         self.main_frame = Frame(self.root, bg="black")
# #         self.main_frame.pack()
# #         self.tool_bar_frame = Frame(self.main_frame, bg="blue", width=500, height=500)
# #         self.tool_bar_frame.grid(row=0, column=0)
# #         self.label_frame1 = LabelFrame(self.tool_bar_frame, width=500, height=500, text="Choose from following options: ", font="arial 12")
# #
# #         self.label_frame1.pack(fill=X, side=LEFT)
# #         self. tool_bar = Frame(self.label_frame1)
# #         self.tool_bar.pack(side=LEFT)
# #         self.button1 = Button(self.tool_bar)
# #         self.button1.pack(side=TOP, padx=2, pady=2)
# #         self.form_frame = Frame(self.main_frame, bg="pink", width=500, height=500)
# #         self.label_frame1 = LabelFrame(self.form_frame, text="Choose dyjedj following options: ", font="arial 12")
# #         self.label_frame1.pack(fill=X)
# #         self.button2 = Button(self.label_frame1)
# #         self.button2.pack(side=TOP, padx=2, pady=2)
# #         self.form_frame.grid(row=0, column=1)
# #         self.root.mainloop()
# #
# #
# # cd = CustomerDetails()
#
# from tkinter import *   # from x import * is bad practice
# # from ttk import *
#
# # http://tkinter.unpythonic.net/wiki/VerticalScrolledFrame
#
# class VerticalScrolledFrame(Frame):
#     """A pure Tkinter scrollable frame that actually works!
#     * Use the 'interior' attribute to place widgets inside the scrollable frame
#     * Construct and pack/place/grid normally
#     * This frame only allows vertical scrolling
#
#     """
#     def __init__(self, parent, *args, **kw):
#         Frame.__init__(self, parent, *args, **kw)
#
#         # create a canvas object and a vertical scrollbar for scrolling it
#         vscrollbar = Scrollbar(self, orient=VERTICAL)
#         vscrollbar.pack(fill=Y, side=RIGHT, expand=FALSE)
#         canvas = Canvas(self, bd=0, highlightthickness=0,
#                         yscrollcommand=vscrollbar.set)
#         canvas.pack(side=LEFT, fill=BOTH, expand=TRUE)
#         vscrollbar.config(command=canvas.yview)
#
#         # reset the view
#         canvas.xview_moveto(0)
#         canvas.yview_moveto(0)
#
#         # create a frame inside the canvas which will be scrolled with it
#         self.interior = interior = Frame(canvas)
#         interior_id = canvas.create_window(0, 0, window=interior,
#                                            anchor=NW)
#
#         # track changes to the canvas and frame width and sync them,
#         # also updating the scrollbar
#         def _configure_interior(event):
#             # update the scrollbars to match the size of the inner frame
#             size = (interior.winfo_reqwidth(), interior.winfo_reqheight())
#             canvas.config(scrollregion="0 0 %s %s" % size)
#             if interior.winfo_reqwidth() != canvas.winfo_width():
#                 # update the canvas's width to fit the inner frame
#                 canvas.config(width=interior.winfo_reqwidth())
#         interior.bind('<Configure>', _configure_interior)
#
#         def _configure_canvas(event):
#             if interior.winfo_reqwidth() != canvas.winfo_width():
#                 # update the inner frame's width to fill the canvas
#                 canvas.itemconfigure(interior_id, width=canvas.winfo_width())
#         canvas.bind('<Configure>', _configure_canvas)
#
#
# if __name__ == "__main__":
#
#     class SampleApp(Tk):
#         def __init__(self, *args, **kwargs):
#             root = Tk.__init__(self, *args, **kwargs)
#
#
#             self.frame = VerticalScrolledFrame(root)
#             self.frame.pack()
#             self.label = Label(text="Shrink the window to activate the scrollbar.")
#             self.label.pack()
#             buttons = []
#             for i in range(10):
#                 buttons.append(Button(self.frame.interior, text="Button " + str(i)))
#                 buttons[-1].pack()
#
#     app = SampleApp()
#     app.mainloop()

import tkinter as tk


# ************************
# Scrollable Frame Class
# ************************
class ScrollFrame(tk.Frame):
    def __init__(self, parent):
        super().__init__(parent)  # create a frame (self)

        self.canvas = tk.Canvas(self, borderwidth=0, background="#ffffff")  # place canvas on self
        self.viewPort = tk.Frame(self.canvas,
                                 background="#ffffff")  # place a frame on the canvas, this frame will hold the child widgets
        self.vsb = tk.Scrollbar(self, orient="vertical", command=self.canvas.yview)  # place a scrollbar on self
        self.canvas.configure(yscrollcommand=self.vsb.set)  # attach scrollbar action to scroll of canvas

        self.vsb.pack(side="right", fill="y")  # pack scrollbar to right of self
        self.canvas.pack(side="left", fill="both", expand=True)  # pack canvas to left of self and expand to fil
        self.canvas.create_window((4, 4), window=self.viewPort, anchor="nw",  # add view port frame to canvas
                                  tags="self.viewPort")

        self.viewPort.bind("<Configure>",
                           self.onFrameConfigure)  # bind an event whenever the size of the viewPort frame changes.

    def onFrameConfigure(self, event):
        '''Reset the scroll region to encompass the inner frame'''
        self.canvas.configure(scrollregion=self.canvas.bbox(
            "all"))  # whenever the size of the frame changes, alter the scroll region respectively.


# ********************************
# Example usage of the above class
# ********************************

class Example(tk.Frame):
    def __init__(self, root):
        tk.Frame.__init__(self, root)

        self.scrollFrame = ScrollFrame(self)  # add a new scrollable frame.

        # Now add some controls to the scrollframe.
        # NOTE: the child controls are added to the view port (scrollFrame.viewPort, NOT scrollframe itself)
        for row in range(100):
            a = row
            tk.Label(self.scrollFrame.viewPort, text="%s" % row, width=3, borderwidth="1",
                     relief="solid").grid(row=row, column=0)
            t = "this is the second column for row %s" % row
            tk.Button(self.scrollFrame.viewPort, text=t, command=lambda x=a: self.printMsg("Hello " + str(x))).grid(
                row=row, column=1)

        # when packing the scrollframe, we pack scrollFrame itself (NOT the viewPort)
        self.scrollFrame.pack(side="top", fill="both", expand=True)

    def printMsg(self, msg):
        print(msg)


if __name__ == "__main__":
    root = tk.Tk()
    Example(root).pack(side="top", fill="both", expand=True)
    root.mainloop()