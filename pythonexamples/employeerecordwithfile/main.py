import employeerecordwithfile.add
import employeerecordwithfile.display
import employeerecordwithfile.update
import employeerecordwithfile.search
import employeerecordwithfile.delete
import ast
lno = [{'id': 1, 'option': 'ADD records'},
       {'id': 2, 'option': 'SEARCH using mobile number'},
       {'id': 3, 'option': 'UPDATE using id'},
       {'id': 4, 'option': 'DELETE using id'},
       {'id': 5, 'option': 'DISPLAY the records'}]
l = []


def ini():
    for i in range(0, len(lno)):
        print(lno[i]['id'], "----", lno[i]['option'])
        print()
    file_read()
    ch()


def file_read():
    global data
    fo = open("doc.txt", 'r')
    while True:
        temp = fo.readline()
        if temp == "":
            break
        else:
            data = ast.literal_eval(temp)
            l.append(data)


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
        employeerecordwithfile.add.add(t, l)

    elif choice == 2:
        print("--------- SEARCH A RECORD ---------")
        t = int(input("Enter the mobile number to fetch the details(Last 4 digits or full number): "))
        employeerecordwithfile.search.search(t, l)
    elif choice == 3:
        print("--------- UPDATE A RECORD ---------")
        employeerecordwithfile.update.update(l)
    elif choice == 4:
        print("--------- DELETE A RECORD ---------")
        t = int(input("Enter the id number to delete the details: "))
        employeerecordwithfile.delete.delete(t, l)
    elif choice == 5:
        print("--------- DISPLAYING THE RECORDS ---------")
        employeerecordwithfile.display.display()
    else:
        print("Wrong number. Enter from 1-5 only")
        ini()


ini()
