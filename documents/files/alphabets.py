"""

 *** 
*   *
*   *
*****
*   *
*   *
*   *

"""



for r in range(1,8):
    for c in range(1,6):
        if((r==1 and (c>1 and c<5)) or (r>1 and (c==1))or (r>1 and c==5) or (r==4 and (c>1 and c<5))):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
print()
print()
print()

"""
**** 
*   *
*   *
*****
*   *
*   *
****
"""
for r in range(1,8):
    for c in range(1,6):
        if(c==1) or ((c>1 and c<5)and r==1) or ((r>1 and r<4) and c==5) or ((c>1 or c<5)and r==4) or ((c>1 and c<5)and r==7) or ((r>4 and r<7) and c==5) :
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()
"""


 *** 
*   *
*    
*    
*    
*   *
 *** 

"""

for r in range(1,8):
    for c in range(1,6):
        if (r==1 and (c>1 and c<5)) or (r==7 and (c>1 and c<5)) or ((r==2 or r==6) and c==5) or (c==1 and (r>1 and r<7)):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()
"""

D

"""

for r in range(1,8):
    for c in range(1,6):
        if (c==1) or (c==5 and r>1 and r<7) or (r==1 and c>1 and c<5) or (r==7 and c>1 and c<5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
E
"""

for r in range(1,8):
    for c in range(1,6):
        if (c==1) or (r==1 and c>1) or (r==7 and c>1) or (r==4 and c>1 and c<5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()


"""

F
"""

for r in range(1,8):
    for c in range(1,6):
        if (c==1) or (r==1 and c>1) or (r==4 and c>1 and c<5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
G
"""


for r in range(1,8):
    for c in range(1,6):
        if (r==1 and c>1 and c<5) or (r==7 and c>1 and c<5) or (c==1 and r>1 and r<7) or (r==4 and c>2 and c<=5) or (c==5 and (r==2 or r==5 or r==6)):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()


"""
H
"""


for r in range(1,8):
    for c in range(1,6):
        if (c==1) or (c==5) or (r==4 and c>1 and c<5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()


"""
I
"""


for r in range(1,8):
    for c in range(1,6):
        if (c==3 and r>1 and r<7) or ((r==1 or r==7) and c>1 and c<5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
J
"""


for r in range(1,8):
    for c in range(1,6):
        if (r==1 and c>1) or (r>1 and r<7 and c==4) or ((c==2 or c==3) and r==7) or (r==6 and c==1):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
K
"""


for r in range(1,8):
    for c in range(1,6):
        if (c==1):
            print("*",end="")
        elif(c==2 and r==4):
            print("*",end="")
        elif(c==3) and (r==3 or r==5) or ((r==2 or r==6) and c==4) or ((r==1 or r==7) and c==5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
L
"""

for r in range(1,8):
    for c in range(1,6):
        if (c==1)or (c>1 and r==7):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()


"""
M
"""

for r in range(1,8):
    for c in range(1,6):
        if (c==1) or (c==5) or (r==2 and (c==2 or c==4)) or (c==3 and r>2 and r<5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
N
"""

for r in range(1,8):
    for c in range(1,6):
        if (c==1) or (c==5) or (r==c):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()


"""
O
"""
for r in range(1,8):
    for c in range(1,6):
        if ((c==1 or c==5) and (r>1 and r<7)) or ((r==1 or r==7) and c>1 and c<5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
P
"""

for r in range(1,8):
    for c in range(1,6):
        if (c==1) or (c==5 and r>1 and r<4) or ((r==1 or r==4) and c>1 and c<5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
Q
"""

for r in range(1,8):
    for c in range(1,6):
        if ((c==1 or c==5) and r>1 and r<7) or ((r==1 or r==7) and c>1 and c<5) or (c==3 and r==5) or (c==4 and r==6) or (c==5 and r==7):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
R
"""

for r in range(1,8):
    for c in range(1,6):
        if (c==1) or (c>1 and c<5 and (r==1 or r==4)) or (r>1 and r<4 and c==5) or (c==3 and r==5) or (r==6 and c==4) or (r==7 and c==5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
S
"""

for r in range(1,8):
    for c in range(1,6):
        if ((r==1 or r==4 or r==7) and c>1 and c<5) or (c==1 and (r>1 and r<4)) or (c==5 and (r>4 and r<7)) or (c==1 and r==6) or (c==5 and r==2):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
T
"""

for r in range(1,8):
    for c in range(1,6):
        if (r==1) or (c==3 and r>1):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
U
"""

for r in range(1,8):
    for c in range(1,6):
        if ((c==1 or c==5) and r<7) or (r==7 and c>1 and c<5):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
V
"""
for r in range(1,8):
    for c in range(1,6):
        if ((c==1 or c==5) and r<6) or (r==6 and (c==2 or c==4)) or (c==3 and r==7):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
W
"""

for r in range(1,8):
    for c in range(1,6):
        if ((c==1 or c==5) and r<7) or (r==7 and (c==2 or c==4)) or (c==3 and r>4 and r<7):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
X
"""
for r in range(1,8):
    for c in range(1,6):
        if ((c==1 or c==5) and (r<3 or r>5)) or ((r==3 or r==5) and (c==2 or c==4)) or (c==3 and r==4):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
Y
"""

for r in range(1,8):
    for c in range(1,6):
        if ((c==1 or c==5) and r<4) or (c==3 and r>4) or (r==4 and (c==2 or c==4)):
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()

"""
Z
"""

for r in range(1,8):
    for c in range(1,6):
        if (r==1) or (r==7) or (c==1 and r==6) or (c==2 and r==5) or (c==3 and r==4) or (c==4 and r==3) or (c==5 and r==2) :
            print("*",end="")
        else:
            print(end=" ")
    print("")      
            
print()
print()
print()


