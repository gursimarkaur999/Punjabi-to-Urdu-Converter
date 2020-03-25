# from reportlab.pdfgen import canvas
#
# c = canvas.Canvas("samplepdf.pdf")
#
# c.drawString(150, 200, "fegfejf")
# c.save()
#
# from fpdf import FPDF
#
#
# class PDF(FPDF):
#     def header(self):
#         # Logo
#         self.image('addcustomer.png', 10, 8, 33)
#         # Arial bold 15
#         self.set_font('Arial', 'B', 20)
#         # Move to the right
#         self.cell(70)
#         # Title
#         self.cell(65, 15, 'COMPANY NAME', 1, 0, 'C')
#         # Line break
#         self.ln(35)
#
#     # Page footer
#     def footer(self):
#         # Position at 1.5 cm from bottom
#         self.set_y(-15)
#         # Arial italic 8
#         self.set_font('Arial', 'I', 8)
#         # Page number
#         self.cell(0, 10, 'Page ' + str(self.page_no()) + '/{nb}', 0, 0, 'C')
#
#
# # Instantiation of inherited class
# pdf = PDF()
# pdf.alias_nb_pages()
# pdf.add_page()
# pdf.set_font('Times', '', 12)
# pdf.cell(0, 10,"xdgdrgtrf", 1, 1)
# pdf.output('tuto2.pdf', 'F')
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt

fig, ax = plt.subplots()
fig.patch.set_visible(False)
ax.axis('off')
ax.axis('tight')

df = pd.DataFrame(np.random.randn(10, 4), columns=list('ABCD'))

ax.table(cellText=df.values, colLabels=df.columns, loc='center')

fig.tight_layout()

plt.show()

plt.savefig("tablepdf.pdf", bbox_inches='tight')