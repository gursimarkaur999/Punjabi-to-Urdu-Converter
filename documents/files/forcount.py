num = int(input("Enter the number"))
count = 0
for i in range(num,0):
    count = count + 1
    i=i//10
    
    print (i)
print("Count =",count)
