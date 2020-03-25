import getpass
import re
from prompt_toolkit import prompt
control = [{'id': 1, 'option': 'LOGIN'},
           {'id': 2, 'option': 'REGISTER'}]
data = {}
li = []


def init():
    for i in range(len(control)):
        print(control[i]['id'], "\t", control[i]['option'])
    ch = int(input("Choose from above : "))
    if ch == 1:
        login()
    elif ch == 2:
        register()
    else:
        print("You entered a wrong value! Select from below : ")
        init()


def login():
    global data, li
    emailvalid = "[a-zA-z_.]+@(gmail|outmail|yahoo|hotmail)\.com"
    print("Login Function")
    eid = input("Email ID: ")
    if re.match(emailvalid, eid):
        pas = getpass.getpass(prompt="Password : ")
        f1 = open("doc.txt", 'r')
        while True:
            temp = f1.readline()
            if temp == "":
                break
            else:
                data = [k for k in temp.split(',')]
                data = {k.split(':')[0]: k.split(':') for k in data}
                li.append(data)
        for i in li:
            if i['Pass'] == pas and i['Email'] == eid:
                print("VALID USER")
                print(i)
                break
        else:
            print("Invalid password")
    else:
        print("Wrong format entered ")
        login()


def register():
    global data
    emailvalid = "[a-zA-z_.]+@(gmail|outmail|yahoo|hotmail)\.com"
    print("Register Function")
    print("ENTER THE BELOW DETAILS CORRECTLY")
    name = input("NAME: ")
    con = True
    while con:
        digit = "[6789]\d{9}"
        email = input("EMAIL ID:")
        if re.match(emailvalid, email):
            con = False
            mob = input("Enter mobile number: ")
            if re.match(digit, mob):
                pas = prompt("PASSWORD : ", is_password=True)
                cp = prompt("CONFIRM PASSWORD: ", is_password=True)
                if cp == pas:
                    temp = 'Name:' + name + ',Mob:' + mob + ',Email:' + email + ',Pass:' + pas
                    print(temp)
                    file = open("doc.txt", 'a')
                    file.write(str(temp) + "\n")

        else:
            print("Wrong format \n Enter in the format as g@gmail.com")
            con = True


init()
