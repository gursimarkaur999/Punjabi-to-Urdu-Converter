l=[5,3,7,6,9,8,33,22,45,2,63,77,19]
count = 0
cp = 0
print(len(l))
for i in l:

    for j in range(2, i//2):
        if i % j == 0:
            count = count+1
            break

    if count == 0:
        print("Count of prime number : ", i)
        cp = cp+1
    count = 0

print("Total number of prime numbers are : ", cp)
