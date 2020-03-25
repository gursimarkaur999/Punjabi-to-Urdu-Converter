import win32api
from py_to_excel import PyToPdf
import os


class ExcelToPdf:
    @staticmethod
    def make_pdf_file():
        excel_file = PyToPdf.upload_to_excel()
        xfile="E:\\pythonexamples\\" + excel_file

        pdffile = xfile   # path to PDF

        printer_name = 'Microsoft Print to PDF'  # name of the printer
        out = '/d:"%s"' % printer_name

        # print the PDF to the proper Printer

        win32api.ShellExecute(0, "print", pdffile, out, ".", 0)

        # remove excel file
        os.remove(excel_file)


ExcelToPdf.make_pdf_file()
