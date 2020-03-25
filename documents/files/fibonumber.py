no1=int(0)
no2=int(1)
count=int(input("Enter the total number of series"))
temp=int(0)
print(no1,no2, end=" ")
for i in range(3,count+1):
    temp=no1+no2
    
    no1=no2
    no2=temp
    print(temp,end=" ")
