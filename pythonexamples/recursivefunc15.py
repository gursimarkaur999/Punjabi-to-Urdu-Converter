# 1st
# def prinno(c):
#     print(c)
#     c+=1
#     if c<=10 :
#         prinno(c)
#
# c=int(input("Enter the number(Limit) : "))
# prinno(c)

# 2nd type
# def even(c,f):
#     if c<=f:
#         if c%2==0:
#             print("Even no. ",c)
#             #c+=1
#             even(c+1,f)
#         else:
#             odd(c,f)
# def odd(c,f):
#     if c<=f:
#         if c%2!=0:
#             print("odd no. ",c)
#             # c+=1
#         odd(c+1,f)
#         # else:
#         #     even(c,f)
#
#
# c=int(input("Enter starting value : "))
# f=int(input("Enter ending value : "))
# odd(c,f)

# 3rd even with 3 functions
#
# def fun(c):
#     if c <= 10:
#         if c % 2 == 0:
#             even(c)
#         else:
#             odd(c)
#
# def even(c):
#     print("Number is even : ",c,"\n")
#     fun(c+1)
#
# def odd(c):
#     print("Number is odd : ",c,"\n")
#     fun(c+1)
#
#
# print("Numbers even or odd upto 10 are : \n")
# fun(1)

# 4th prime numbers
# def fun(c,f):
#     if c <= f:
#         prime(c)
#         fun(c + 1, f)
#
#
# def prime(c):
#     no(c, 2, c // 2)
#
#
# def no(c, t, f):
#     count = 0
#     if t <= f:
#         if c % t == 0:
#             count = count + 1
#     if count == 0 and c != 1:
#         print("Number is prime : ", c)
#
#
# c = int(input("Enter any starting number : "))
# f = int(input("Enter the ending number : "))
# fun(c, f)

# fibonacci series
# def fun(x, y, no):
#     if no >= 1:
#         sumfib = x + y
#         x = y
#         y = sumfib
#         print(y)
#         no -= 1
#         fun(x,y,no)
#
#
# def intial(no):
#     x = 0
#     y = 1
#     if no > 2:
#         print(x)
#         print(y)
#         no=no-2
#         fun(x,y,no)
#
#
# c = int(input("Enter the number of elements you want to print for fibonacci series : "))
# intial(c)


def fac(no,f):
    f=f*no
    no=no-1
    if no > 1:
        fac(no,f)
    else:
        print("Factorial Number is : ",f)


c = int(input("Enter any number to find its factorial : "))
fac(c,1)


