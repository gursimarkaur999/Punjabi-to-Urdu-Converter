# Python code to demonstrate the working of
# calendar() function to print calendar

# importing calendar module
# for calendar operations
import calendar

# using calender to print calendar of year
# prints calendar of 2018
x = int(input("Enter the year for the calendar: "))
print("The calender of year 2018 is : ")
print(calendar.calendar(x, 2, 1, 6))
# from bs4 import beautifulsoup
# import requests
#
# image = requests.get('https://i.dailymail.co.uk/i/pix/2017/06/22/03/419F9CC900000578-4627106-image-a-18_1498096910543.jpg').content
# print(image)
# with open('my_image.jpg', 'wb') as f:
#     f.write(image)
