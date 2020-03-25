#reverse a number
num=int(input("Enter the number"))
count=0
pre,num2=num,num
final = 0
while num>0:
    count=count+1
    num=num//10
    print(num)
print(count)
while pre>0:
    rem=pre%10
    final=final + rem**count
    pre=pre//10
print("number is = ",final)
if(final==num2):
    print("it is an armstrong number")
else:
    print("it is not an armstrong number")
