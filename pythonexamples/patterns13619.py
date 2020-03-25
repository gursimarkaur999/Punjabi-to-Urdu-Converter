row=int(input("Enter rows : "))
half=(row+1)//2
print(half)
l=0
for i in range(1, row+1):
    t=i
    if i <= half:
        for j in range((half-i), 0, -1):
            print("-", end=" ")
        for l in range(0,t):
            print("#", end=" ")
    else:
        #print("else part")
        for k in range(0,i-half):
            print("-", end=" ")
    for temp in range(i):
        t=t+i
    print(" ")
