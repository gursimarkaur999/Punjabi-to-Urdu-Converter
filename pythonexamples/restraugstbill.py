def inti():
    for i in range(len(no)):
        print(no[i], end="\t")
        print(it[i], end="\t")
        print(pr[i], end="\t")
        print()
        ask()


def ask():
    a = int(input("Enter the name or number of the product : "))
    q = int(input("Enter the quantity : "))
    pri(a, q)

    # if a == '1' or a == 'b' or a[0] == 'b':
    #     a = 1
    #     pri(a, q)
    # if a == '2' or a[0] == 'f' or a[0] == 'F':
    #     a = 2
    #     pri(a, q)
    # if a == '3' or a[0] == 'c' or a[0] == 'c':
    #     a = 3
    #     pri(a, q)
    # if a == '4' or a[0] == 'l' or a[0] == 'L':
    #     a = 4
    #     pri(a, q)
    # if a == '5' or a[0] == 'i' or a[0] == 'I':
    #     a = 5
    #     pri(a, q)
    control = input("Would you like to order something else ('y' for yes and 'n' for no): ")
    if control[0] == 'y':
        ask()
    else:
        bill()


def bill():
    tsum = 0
    total = 0
    ta = input("Take away or not : ('y' for yes and 'n' for no)")
    for i in tp:
        tsum += i
    if ta == 'y':
        total = tsum
        display(total)
    else:
        total = 0.18 * tsum
        display(total)


def display(t):
    print("_______BILL_______")
    for i in range(len(price)):
        print(price[i], "\t", gst[i], "\t", tp[i])


def pri(a, q):
    while control[0] != 'n':
        if a != 0:
            price[a-1] = pr[a - 1] * q
            gst[a-1] = 0.5*price[a-1]
            tp[a-1] = price[a-1] + gst[a-1]


no = [1, 2, 3, 4, 5]
it = ['Burger', 'French Fries', 'Coke', 'Lemonade', 'Ice Cream']
pr = [120, 90, 50, 60, 70]
gst = []
price = []
tp = []
control = "y"

inti()

