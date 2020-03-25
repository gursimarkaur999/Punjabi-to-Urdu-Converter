#count even odd numbers
num=int(input("Enter the number: "))
counte=0
counto=0
while num>0:
    rem=num%10
    num=num//10
    if (rem%2==0):
        counte=counte+1
        print("remainder is : (even)",rem)
    else:
        counto=counto+1
        print("remainder is : (odd)",rem)
print("Number of even digits in given number are : ",counte,"\n Number of odd digita in given number are : ",counto)
