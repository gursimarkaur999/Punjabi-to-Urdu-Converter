import employeerecordwithfile.display


def delete(td, l):
    print("delete function", td)
    for i in range(0, len(l)):
        if l[i]['id'] == td:
            confirm = input("Are you sure (y for yes and n for no):")
            if confirm[0] == 'y':
                del l[i]
            break
    f1 = open("doc.txt", 'w')
    for i in l:
        f1.write(str(i) + "\n")
    f1.close()
    employeerecordwithfile.display.display()
