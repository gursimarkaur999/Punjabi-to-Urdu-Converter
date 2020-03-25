l= [4, 8, 7, 5, 3, 12, 2, 11, 10]
print(l)
for j in range(len(l)):
    for i in range(len(l)-1):
        if l[i] > l[i+1]:
            temp = l[i]
            l[i] = l[i+1]
            l[i+1] = temp
print(l)
t = len(l)-1
print("Largest number: ", l[t])
print("Smallest number: ", l[0])
print("Second smallest is : ", l[1])
print("Second largest is : ", l[t-1])

co = 0
ce = 0
for i in range(len(l)):
    if l[i] % 2 == 0:
        ce = ce+1
        print("even number is : ", l[i])
    else:
        co = co+1
        print("odd number is : ", l[i])

print("Total even numbers in the list : ", ce)
print("Total odd numbers in the list : ", co)
