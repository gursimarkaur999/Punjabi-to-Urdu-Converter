a=float(input("Enter any four numbers \n First number is : "))
b=float(input("Second number is : "))
c=float(input("Third number is : "))
d=float(input("Fourth number is : "))
if(a<b):
    if(a<c):
        if(a<d):
            print("first number is th esmallest")
        else:
            print("Fourth number is smallest")
    else:
        if(c<d):
            print("Third number is smallest")
        else:
            print("Fourth number is smallest")
else:
    if(b<c):
        if(b<d):
            print(" second number is th esmallest")
        else:
            print("Fourth number is smallest")
    else:
        if(c<d):
            print("Third number is smallest")
        else:
            print("Fourth number is smallest")
    
    
    
    
