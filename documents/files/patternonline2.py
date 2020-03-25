for i in range(1,11):
    for j in range(0,i):
        print("#", end="")
    for r in range(10,i,-1):
        print(" ",end="")

    for k in range(9,i,-1):
        print(" ",end="")
    if(i==10):
        i=i-1
    for l in range(i,0,-1):
            print("#",end="")
            #if(i==10):
                #for m in range(1):
                   # print("#",end ="")
    print("")
    
