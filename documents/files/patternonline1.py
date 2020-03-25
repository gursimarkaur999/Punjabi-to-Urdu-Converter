"""
for i in range(1,5):
    for j in range(1,i+1):
        print("*", end="")
    print("")
"""
#*
#**
#***
#****
"""

for i in range(1,5):
    for j in range(0,i):
        print(j, end="")
    print("")

"""
#0
#01
#012
#0123
"""

for i in range(1,6):
    for j in range(7,i,-1):
        print("*", end="")
    print("")

"""
#******
#*****
#****
#***
#**
"""
"""

for i in range(6,1,-1):
    for r in range(0,i):
        print(r, end="")
    print("")
"""
012345
01234
0123
012
01
"""
