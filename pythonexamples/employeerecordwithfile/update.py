import employeerecordwithfile.display
import ast

l_up = [{'id': 1, 'option': 'Name'},
       {'id': 2, 'option': 'Mobile Number'},
       {'id': 3, 'option': 'Address'},
       {'id': 4, 'option': 'Name and Mobile number'},
       {'id': 5, 'option': 'Mobile number and Address'},
       {'id': 6, 'option': 'Name and Address'},
       {'id': 7, 'option': 'All three to be updated'}]


def update(l):
    global l_up
    tu = int(input("Enter the id number to update the details: "))
    print("update function", tu)
    for r in range(0, len(l_up)):
        print(l_up[r]['id'], "----", l_up[r]['option'])
        print()
    up_choice = int(input("Enter your choice : "))
    if up_choice == 1:
        up_name(tu, l)
        file_read_up(l)
    elif up_choice == 2:
        up_m_no(tu, l)
        file_read_up(l)
    elif up_choice == 3:
        up_address(tu, l)
        file_read_up(l)
    elif up_choice == 4:
        up_na_mno(tu, l)
        file_read_up(l)
    elif up_choice == 5:
        up_mno_a_add(tu, l)
        file_read_up(l)
    elif up_choice == 6:
        up_n_a_add(tu, l)
        file_read_up(l)
    elif up_choice == 7:
        up_all(tu, l)
        file_read_up(l)
    else:
        print("Wrong option selected ")
        update(l)


def up_name(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            l[i]['name'] = name


def up_m_no(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            mobile = int(input("Enter the mobile number : "))
            l[i]['mno'] = mobile


def up_address(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            address = input("Enter the address : ")
            l[i]['add'] = address


def up_na_mno(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            mobile = int(input("Enter the mobile number : "))
            l[i]['name'] = name
            l[i]['mno'] = mobile


def up_mno_a_add(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            mobile = int(input("Enter the mobile number : "))
            address = input("Enter the address : ")
            l[i]['mno'] = mobile
            l[i]['add'] = address


def up_n_a_add(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            address = input("Enter the address : ")
            l[i]['name'] = name
            l[i]['add'] = address


def up_all(tu, l):
    for i in range(len(l)):
        if l[i]['id'] == tu:
            name = input("Enter the name of the person")
            mobile = int(input("Enter the mobile number : "))
            address = input("Enter the address : ")
            l[i]['name'] = name
            l[i]['mno'] = mobile
            l[i]['add'] = address


def file_read_up(l):
    fo = open("doc.txt", 'w')
    for i in l:
        fo.write(str(i) + "\n")
    fo.close()
