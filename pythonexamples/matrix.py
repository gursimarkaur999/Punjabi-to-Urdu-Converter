l=[[1,2,3],[4,5,6],[7,8,9]]
print(l)
sum=0
for i in l:
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
for i in range(0,len(l)):
    col=0
    for j in range(0,len(l)):
        col+=l[j][i]
        if i==j:
            dia+=l[i][j]
        if i>j:
            lt+=l[i][j]
        if j>i:
            ut+=l[i][j]
        if i+j==(len(l)-1):
            odia+=l[i][j]

    print("sum of ",i,"column",col)
print("Sum of upper matrix : ",ut)
print("Sum of lower matrix :",lt)
print("Sum of opposite diagonal : ",odia)
print("Sum of the diagonal is : ",dia)