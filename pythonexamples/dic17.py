lno = [{'id': 1, 'option': 'ADD records'},
       {'id': 2, 'option': 'SEARCH using mobile number'},
       {'id': 3, 'option': 'UPDATE using id'},
       {'id': 4, 'option': 'DELETE using id'},
       {'id': 5, 'option': 'DISPLAY the records'}]
lup = [{'id': 1, 'option': 'Name'},
       {'id': 2, 'option': 'Mobile Number'},
       {'id': 3, 'option': 'Address'},
       {'id': 4, 'option': 'Name and Mobile number'},
       {'id': 5, 'option': 'Mobile number and Address'},
       {'id': 6, 'option': 'Name and Address'},
       {'id': 7, 'option': 'All three to be updated'}]
l = []


def ini():
    for i in range(0, len(lno)):
        print(lno[i]['id'], "----", lno[i]['option'])
        print()
    ch()


def ch():
    choice = int(input("Enter any number from above according to your choice : "))
    print(choice)
    control(choice)
    c = input("Do you want to perform any other operation : ('y' for yes and 'n' for no)")
    if c == 'y':
        ch()
    else:
        exit()


def control(choice):
    if choice == 1:
        print("--------- ADD RECORDS ---------")
        t = int(input("Enter the number of records you want to add: "))
        add(t)

    elif choice == 2:
        print("--------- SEARCH A RECORD ---------")
        t = int(input("Enter the mobile number to fetch the details(Last 4 digits or full number): "))
        search(t)
    elif choice == 3:
        print("--------- UPDATE A RECORD ---------")
        update()
    elif choice == 4:
        print("--------- DELETE A RECORD ---------")
        t = int(input("Enter the id number to delete the details: "))
        delete(t)
    elif choice == 5:
        print("--------- DISPLAYING THE RECORDS ---------")
        display()
    else:
        print("Wrong number. Enter from 1-5 only")
        ini()


def add(ta):
    con = "True"
    c = 0
    print("Add function", ta)
    if ta >= 1:
        while con == "True":
            idno = int(input("Enter the record id : "))
            for i in range(len(l)):
                if l[i]['id'] == idno:
                    print("\nID ALREADY EXISTS\n")
                    c = 1
            if c == 1:
                c = 0
                continue
            else:
                con = "False"
        name = input("Enter the name of the person")
        con = "True"
        while con == "True":
            mobile = input("Enter the mobile number : ")
            if mobile.isdigit():

                if len(mobile) > 10 or len(mobile) < 10:
                    print("INVALID NUMBER Re-enter again")
                    c = 1

                else:
                    for i in range(len(l)):
                        if l[i]['mno'] == mobile:
                            print("\nMOBILE NUMBER ALREADY EXISTS\n")
                            c = 1
            else:
                print("Mobile number is not in digits")
                c = 1

            if c == 1:
                c = 0
                continue
            else:
                con = "False"

        address = input("Enter the address : ")
        record = {'id': idno, 'name': name, 'mno': mobile, 'add': address}
        l.append(record)
        ta -= 1
        add(ta)


def search(ts):
    print("search function", ts)
    for i in range(len(l)):
        digit = l[i]['mno'] % 10000
        if l[i]['mno'] == ts:
            print(l[i]['id'], " ", l[i]['name'], " ", l[i]['mno'], " ", l[i]['add'])
        if digit == ts:
            print(l[i]['id'], " ", l[i]['name'], " ", l[i]['mno'], " ", l[i]['add'])


def update():
    tu = int(input("Enter the id number to update the details: "))
    print("update function", tu)
    for r in range(0, len(lup)):
        print(lup[r]['id'], "----", lup[r]['option'])
        print()
    upchoice = int(input("Enter your choice : "))
    if upchoice == 1:
        upname(tu)
    elif upchoice == 2:
        upmno(tu)
    elif upchoice == 3:
        upaddress(tu)
    elif upchoice == 4:
        upnamno(tu)
    elif upchoice == 5:
        upmnoaadd(tu)
    elif upchoice == 6:
        upnaaadd(tu)
    elif upchoice == 7:
        upall(tu)
    else:
        print("Wrong option selected ")
        update()


def upname(tu):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            l[i]['name'] = name
    display()


def upmno(tu):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            mobile = int(input("Enter the mobile number : "))
            l[i]['mno'] = mobile
    display()


def upaddress(tu):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            address = input("Enter the address : ")
            l[i]['add'] = address
    display()


def upnamno(tu):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            mobile = int(input("Enter the mobile number : "))
            l[i]['name'] = name
            l[i]['mno'] = mobile

    display()


def upmnoaadd(tu):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            mobile = int(input("Enter the mobile number : "))
            address = input("Enter the address : ")
            l[i]['mno'] = mobile
            l[i]['add'] = address

    display()


def upnaaadd(tu):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            address = input("Enter the address : ")
            l[i]['name'] = name
            l[i]['add'] = address

    display()


def upall(tu):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            mobile = int(input("Enter the mobile number : "))
            address = input("Enter the address : ")
            l[i]['name'] = name
            l[i]['mno'] = mobile
            l[i]['add'] = address

    display()


def delete(td):
    print("delete function", td)
    for i in range(0, len(l)):
        if l[i]['id'] == td:
            confirm = input("Are you sure (y for yes and n for no):")
            if confirm[0] == 'y':
                del l[i]
            break
    display()


def display():
    print("display function")
    for i in range(len(l)):
        for j in l[i]:
            print(l[i][j], "     ", end=" ")
        print()


ini()
