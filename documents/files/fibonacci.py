first=1
second=1
temp=0
c = int(input("Enter the number of elements you want to add"))
i=1
print("The fibonacci series are:\n",first,"\n",second)
while i<c:
    temp = first + second
    first=second
    second=temp
    print(temp)
    i=i+1
