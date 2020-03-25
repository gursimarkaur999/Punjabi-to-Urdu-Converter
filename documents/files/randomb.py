print("Enter a number equal to or greater than 7 ")

ri = int(input("Enter the number of rows : "))
ci = ri-2
if(ri>=7):
    for r in range(1,ri+1):
        for c in range(1,ci+1):
            if(c==1) or ((c>1 and c<ci)and r==1) or ((c>1 and c<ci)and r==ri) or ((c>1 and c<ci)and r==(ri+1)//2) or (c==ci and (r>1 and r<(ri+1)//2)) or (c==ci and (r>(ri+1)//2) and r<ri)  :
                print("*",end="")
            else:
                print(end=" ")
        print("")           
else:
    print("Number is less than 7")
print()
print()
print()
