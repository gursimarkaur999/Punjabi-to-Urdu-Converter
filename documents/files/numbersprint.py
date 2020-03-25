for r in range(1,8):
    for c in range(1,6):
        if (c==3) or (r==7 and c>1 and c<5) or (c==2 and r==2):
            print("*", end="")
        else:
            print(end = " ")
    print("")
print()
print()
print()

"""
2
"""
for r in range(1,8):
    for c in range(1,6):
        if (r==7) or (r==1 and c>1 and c<5) or (c==5 and r>1 and r<4) or (r==c==4) or (c==3 and r==5) or (c==2 and r==6) or (c==1 and r==2):
            print("*", end="")
        else:
            print(end = " ")
    print("")
print()
print()
print()

"""
3
"""

for r in range(1,8):
    for c in range(1,6):
        if (r==1) or (r==7 and c>1 and c<5) or (r==6 and (c==1 or c==5)) or (c==5 and (r==2 or r==5)) or (r==4 and c>2 and c<5) or (c==r+1==4):
            print("*", end="")
        else:
            print(end = " ")
    print("")
print()
print()
print()

"""
4
"""

for r in range(1,8):
    for c in range(1,6):
        if (c==4) or (r==5) or (r+c==5):
            print("*", end="")
        else:
            print(end = " ")
    print("")
print()
print()
print()

"""
5
"""
for r in range(1,8):
    for c in range(1,6):
        if (r==1) or (c==1 and (r==6 or r==2 or r==3)) or ((r==3 or r==7) and c>1 and c<5) or (c==5 and r>3 and r<7):
            print("*", end="")
        else:
            print(end = " ")
    print("")
print()
print()
print()

"""
6
"""

for r in range(1,8):
    for c in range(1,6):
        if (c==1 and r>1 and r<7) or ((r==1 or r==4 or r==7) and c>1 and c<5) or (c==5 and (r==2 or (r>4 and r<7))):
            print("*", end="")
        else:
            print(end = " ")
    print("")
print()
print()
print()


"""
7
"""

for r in range(1,8):
    for c in range(1,6):
        if (r==1) or (c==2 and r>4) or (c==5 and r==2) or (r==3 and c==4) or (r==4 and c==3):
            print("*", end="")
        else:
            print(end = " ")
    print("")
print()
print()
print()

"""
8
"""
for r in range(1,8):
    for c in range(1,6):
        if ((r==1 or r==4 or r==7) and c>1 and c<5) or ((c==1 or c==5) and ((r>1 and r<4)or (r>4 and r<7))):
            print("*", end="")
        else:
            print(end = " ")
    print("")
print()
print()
print()

"""
9
"""
for r in range(1,8):
    for c in range(1,6):
        if ((r==1 or r==4 or r==7) and c>1 and c<5) or (c==5 and r>1 and r<7) or (c==1 and r>1 and r<4) or (c==1 and r==6):
            print("*", end="")
        else:
            print(end = " ")
    print("")
print()
print()
print()

"""
0
"""
for r in range(1,8):
    for c in range(1,6):
        if ((r==1 or r==7) and c>1 and c<5) or ((c==1 or c==5) and r>1 and r<7) or (r==3 and c==2) or (r==4 and c==3) or (r==5 and c==4):
            print("*", end="")
        else:
            print(end = " ")
    print("")
print()
print()
print()
