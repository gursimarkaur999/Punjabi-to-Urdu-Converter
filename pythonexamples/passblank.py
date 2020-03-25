import getpass

a = "abc"
pas = getpass.getpass(prompt="Password: ")

if pas == a:
    print("LOGIN")
else:
    print("Wrong password")
