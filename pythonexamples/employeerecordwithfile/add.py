temp = " "


def add(ta, l):
    global temp
    con = "True"
    c = 0
    print("Add function", ta)
    if ta >= 1:
        while con == "True":
            id_no = int(input("Enter the record id : "))
            for i in range(len(l)):
                if l[i]['id'] == id_no:
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
        temp = {'id': id_no, 'name': name, 'mno': mobile, 'add': address}
        print(temp)
        file = open("doc.txt", 'a')
        file.write(str(temp) + "\n")
        file.close()
        ta -= 1
        add(ta, l)
