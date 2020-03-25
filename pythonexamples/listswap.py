l=[1,2,3,4,5,6,7,8,9,10]
no=len(l)
print(l)
"""
#output is 
#[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
#[2, 1, 4, 3, 6, 5, 8, 7, 10, 9]
for i in range (0, no-1, 2):
    temp=l[i]
    l[i] = l[i+1]
    l[i+1] = temp

print(l)
"""
# i=0
# while i<=no-1 :
#     temp = l[i]
#     l[i] = l[i + 1]
#     l[i + 1] = temp
#     i=i+2
# print(l)
"""
#output is
#[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
#[6, 7, 8, 9, 10, 1, 2, 3, 4, 5]

for i in range (0, no-5):
    temp = l[i]
    l[i] = l[i + 5]
    l[i + 5] = temp

print(l)

"""

"""

i = 0
length = len(l)
c = len(l)//2
while i < length/2:
    temp = l[i]
    l[i] = l[i + c]
    l[i + c] = temp
    i = i+1
print(l)
"""


"""
#output is 
#[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
#[10, 9, 8, 7, 5, 6, 4, 3, 2, 1]

no=no-1
for i in range(0, no//2):
    temp = l[i]
    l[i] = l[no-i]
    l[no-i] = temp

print(l)
"""
print(no)
i=0
c=no-1
while i < no//2:
    temp = l[i]
    l[i] = l[c-i]
    l[c-i] = temp
    i = i+1
print(l)

