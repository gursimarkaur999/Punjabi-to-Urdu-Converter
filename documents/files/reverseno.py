#reverse a number
num=int(input("Enter the number"))

final = 0
while num>0:
    rem=num%10
    final=rem+ final*10
    num=num//10
print("final",final)
