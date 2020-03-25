print("Enter a number equal to or greater than 7 ")

ri = int(input("Enter the number of rows : "))
ci = ri-2
if(ri>=7):
    for r in range(1,ri+1):
        for c in range(1,ci+1):
            if (r==1 and c>1 and c<ci) or (r==ri and c>1 and c<ci) or (c==1 and r>1 and r<ri) or (r==ri-3 and c>ci-3 and c<=ci) or (c==ci and (r==2 or r==ri-2 or r==ri-1)):
                print("*",end="")
            else:
                print(end=" ")
        print("")      
else:
    print("Number is less than 7")
print()
print()
print()
