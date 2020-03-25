print("NOTE : ROWS and COLUMN value is required to be same\n\n")

row = int(input("Enter the total number of rows : "))
t=[]
l=[]
for r in range(row):
    for i in input("Enter values for the row : ").split(","):
        l.append(i)
        k = 0
        for j in l:
            l[k] = int(j)
            k += 1
    t.append(l)

    print(l)
    l = []
    print(type(l))

print(t)
print(type(t))
print(l)
sum=0
for i in t:
    row=0
    col=0
    for r in i:
        sum+=r
        row+=r
    print("sum of",i,"row : ",row)
print("Sum is : ", sum)

dia=0
odia=0
lt=0
ut=0
for i in range(0,len(t)):
    col=0
    for j in range(0,len(t)):
        col += t[j][i]
        if i== j:
            dia+=t[i][j]
        if i>j:
            lt+=t[i][j]
        if j>i:
            ut+=t[i][j]
        if i+j==(len(t)-1):
            odia+=t[i][j]

    print("sum of ",i,"column",col)
print("Sum of upper matrix : ",ut)
print("Sum of lower matrix :",lt)
print("Sum of opposite diagonal : ",odia)
print("Sum of the diagonal is : ",dia)