import employerecord.add
import employerecord.displayrecord
import employerecord.updaterecord
import employerecord.searchrecord
import employerecord.deleterecord
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
        employerecord.add.add(t, l)

    elif choice == 2:
        print("--------- SEARCH A RECORD ---------")
        t = int(input("Enter the mobile number to fetch the details(Last 4 digits or full number): "))
        employerecord.searchrecord.search(t,l)
    elif choice == 3:
        print("--------- UPDATE A RECORD ---------")
        employerecord.updaterecord.update(l)
    elif choice == 4:
        print("--------- DELETE A RECORD ---------")
        t = int(input("Enter the id number to delete the details: "))
        employerecord.deleterecord.delete(t,l)
    elif choice == 5:
        print("--------- DISPLAYING THE RECORDS ---------")
        employerecord.displayrecord.display(l)
    else:
        print("Wrong number. Enter from 1-5 only")
        ini()


ini()
