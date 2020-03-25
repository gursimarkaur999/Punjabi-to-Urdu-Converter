##STATIC
for r in range(7):
    for c in range(7):
        if r == c or (r+c == 6) or c == 3 or r == 3:
            print("*", end = "")
        else:
            print(end=" ")
    print("")      

print()#spacing between pattern
print()#spacing between pattern


##DYNAMIC
rows = int(input("Enter the rows and columns(Square matrix): "))
col = rows
for r in range(rows):
    for c in range(col):
        if r == c or (r+c == rows-1) or c == ((rows-1)//2) or r == ((rows-1)//2):
            print("*", end = "")
        else:
            print(end=" ")
    print("")      
print() #spacing between pattern
print() #spacing between pattern

##USING ELIF

rows = int(input("Enter the rows and columns(Square matrix): "))
col = rows
for r in range(rows):
    for c in range(col):
        if r == c:
            print("*", end = "")

        elif (r+c == rows-1):
             print("*", end = "")

        elif c == ((rows-1)//2):
             print("*", end = "")
             
        elif r == ((rows-1)//2):
            print("*", end = "")

        else:
            print(end=" ")
    print("")      
print() #spacing between pattern
print() #spacing between pattern
