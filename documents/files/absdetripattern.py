l=['A','B','C','D','E']
for i in range(5):
    for j in range(5,i+1,-1):
        print(" ",end=" ")
    for k in range(i+1):
            print(l[i]," ",end=" ")
    print("")   


"""
        A   
      B   B   
    C   C   C   
  D   D   D   D   
E   E   E   E   E   
"""
first='A'
t=ord(first)
for i in range(5):
    for j in range(5,i+1,-1):
        print(" ",end=" ")
    for k in range(i+1):
            print(chr(t)," ",end=" ")
    t=t+1        
    print("")   

