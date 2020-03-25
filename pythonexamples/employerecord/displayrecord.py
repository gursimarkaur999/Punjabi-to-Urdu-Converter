def display(l):
    print("display function")
    for i in range(len(l)):
        for j in l[i]:
            print(l[i][j], "     ", end=" ")
        print()
