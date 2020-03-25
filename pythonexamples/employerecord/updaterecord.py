import employerecord.displayrecord

lup = [{'id': 1, 'option': 'Name'},
       {'id': 2, 'option': 'Mobile Number'},
       {'id': 3, 'option': 'Address'},
       {'id': 4, 'option': 'Name and Mobile number'},
       {'id': 5, 'option': 'Mobile number and Address'},
       {'id': 6, 'option': 'Name and Address'},
       {'id': 7, 'option': 'All three to be updated'}]


def update(l):
    tu = int(input("Enter the id number to update the details: "))
    print("update function", tu)
    for r in range(0, len(lup)):
        print(lup[r]['id'], "----", lup[r]['option'])
        print()
    upchoice = int(input("Enter your choice : "))
    if upchoice == 1:
        upname(tu, l)
    elif upchoice == 2:
        upmno(tu, l)
    elif upchoice == 3:
        upaddress(tu, l)
    elif upchoice == 4:
        upnamno(tu, l)
    elif upchoice == 5:
        upmnoaadd(tu, l)
    elif upchoice == 6:
        upnaaadd(tu, l)
    elif upchoice == 7:
        upall(tu, l)
    else:
        print("Wrong option selected ")
        update(l, lup)


def upname(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            l[i]['name'] = name
    employerecord.displayrecord.display(l)


def upmno(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            mobile = int(input("Enter the mobile number : "))
            l[i]['mno'] = mobile
    employerecord.displayrecord.display(l)


def upaddress(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            address = input("Enter the address : ")
            l[i]['add'] = address
    employerecord.displayrecord.display(l)


def upnamno(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            mobile = int(input("Enter the mobile number : "))
            l[i]['name'] = name
            l[i]['mno'] = mobile

    employerecord.displayrecord.display(l)


def upmnoaadd(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            mobile = int(input("Enter the mobile number : "))
            address = input("Enter the address : ")
            l[i]['mno'] = mobile
            l[i]['add'] = address

    employerecord.displayrecord.display(l)


def upnaaadd(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            address = input("Enter the address : ")
            l[i]['name'] = name
            l[i]['add'] = address

    employerecord.displayrecord.display(l)


def upall(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            mobile = int(input("Enter the mobile number : "))
            address = input("Enter the address : ")
            l[i]['name'] = name
            l[i]['mno'] = mobile
            l[i]['add'] = address

    employerecord.displayrecord.display(l)
