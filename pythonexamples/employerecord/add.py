def add(ta, l):
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
        add(ta, l)

