#input a number and count the number of digits
num=int(input("Enter any number"))
count=0
while num>0:
    count=count+1
    num=num//10
    print(num)
print("Number of digits in the number entered is: ",count)
