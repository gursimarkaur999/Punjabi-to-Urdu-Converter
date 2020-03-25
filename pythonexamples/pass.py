from prompt_toolkit import prompt
name = prompt("Username")
password = prompt("Password: ", is_password=True)
if name != 'gur' or password != 'gur':
    print("\n invalid username or password !")
