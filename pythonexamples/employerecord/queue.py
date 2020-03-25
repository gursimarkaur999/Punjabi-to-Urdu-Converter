st = input("Enter elements of queue : ").split(" ")
print(st)
j = 0
for i in st:
    st[j] = int(i)
    j = j+1
print(st)
ch=input("Enter i for insertion and d for deletion : ")
if ch[0] == 'i':
    print("INSERTION (At rear end)")
    val = int(input("Enter any value for element : "))
    st = st + [val]
elif ch[0] == 'd':
    print("DELETION (at front end)")
    print("First element gets deleted : ", st[0])
    del st[0]
else:
    print("You entered a wrong value : ")
print("The list is : ", st)
