l = input("Enter list values : ").split(" ")
print(l)
print(type(l[0]))
j = 0
for i in l:
    l[j] = int(i)
    j = j+1
print(l)
print()
ch = input("Enter i for insertion in stack and d for deletion from stack : ").split(" ")

if ch[0]=='i':
    print("INSERTION")
    val=int(input("enter an integer value : "))
    l=l+[val]
    print("Resulted stack is : ",l)
elif ch[0]=='d':
    print("DELETION")
    print("Last element gets deleted.", l[len(l)-1])
    del l[len(l)-1]
    print("Elements in stack are : ")
    print(l)
else:
    print("Wrong input")