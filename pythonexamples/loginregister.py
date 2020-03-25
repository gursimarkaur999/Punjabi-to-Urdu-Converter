import getpass
import re
from prompt_toolkit import prompt
control = [{'id': 1, 'option': 'LOGIN'},
           {'id': 2, 'option': 'REGISTER'}]


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
    emailvalid = "[a-zA-z_.]+@(gmail|outmail|yahoo|hotmail)\.com"
    print("Login Function")
    eid = input("Email ID: ")
    if re.match(emailvalid, eid):

        pas = getpass.getpass(prompt="Password : ")
        f1 = open(eid, 'r')
        data = f1.read().split('\n')
        print(data)
        for i in data:
            if i == pas:
                print("VALID USER")
                for j in data:
                    if j != i:
                        print(j)

                break
        else:
            print("Invalid password")
    else:
        print("Wrong format entered ")
        login()


def register():
    emailvalid = "[a-zA-z_.]+@(gmail|outmail|yahoo|hotmail)\.com"
    print("Register Function")
    print("ENTER THE BELOW DETAILS CORRECTLY")
    name = input("NAME: ")
    con = True
    while con:
        email = input("EMAIL ID:")
        if re.match(emailvalid, email):
            con = False
            mob = input("Enter mobile number: ")
            pas = prompt("PASSWORD : ", is_password=True)
            cp = prompt("CONFIRM PASSWORD: ", is_password=True)
            if cp == pas:
                data = name + "\n" + mob + "\n" + pas + "\n"
                file = open(email, 'w')
                file.write(data)
        else:
            print("Wrong format \n Enter in the format as g@gmail.com")
            con = True


init()
