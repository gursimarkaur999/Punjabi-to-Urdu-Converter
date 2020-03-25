import employerecord.displayrecord


def delete(td, l):
    print("delete function", td)
    for i in range(0, len(l)):
        if l[i]['id'] == td:
            confirm = input("Are you sure (y for yes and n for no):")
            if confirm[0] == 'y':
                del l[i]
            break
    employerecord.displayrecord.display(l)
