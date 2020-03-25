l=[1,2,3,4,5,6,7,8,9,10]
min=l[0]

max=l[0]
for i in l:
    if (min>i):

        min=i

for j in l:
    if (max<i):

        max=i
print("Maximum value is : ",max,"\nMinimum value is : ",min)
