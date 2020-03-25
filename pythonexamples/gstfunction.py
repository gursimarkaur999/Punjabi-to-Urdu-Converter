def func(c):
    inp = input("Enter p for product and s for service : ")
    if inp[0] != 'p' and inp != 's':
        print("Wrong input")
        func('y')
    q = int(input("Enter the Quantity of the item : "))
    price = int(input("Enter the price of each item: "))
    if inp[0] == 'p':
        temp = int(price*q)
        lp.append(temp)
    if inp[0] == 's':
        temp1 = int(price*q)
        ls.append(temp1)


lp = []
ls = []
gstp = []
gsts = []
tp = []
ts = []
count = 0
cin = input("Enter y to add new element in the bill and n to end the bill and get the total : ")
if cin[0] == 'y':
    while cin == 'y':
        func(cin)
        cin = input("Enter y to add new element in the bill and n to end the bill and get the total : ")
if cin[0] == 'n':
    for i in range(len(lp)):
        gstp.append(0.05 * lp[i])
    for ki in range(len(lp)):
        temp2 = gstp[ki] + lp[ki]
        tp.append(temp2)
    for j in range(len(ls)):
        gsts.append(0.18 * ls[j])
    for kj in range(len(ls)):
        temp3 = gsts[kj] + ls[kj]
        ts.append(temp3)
    print("_________BILL_________")
    print("Item \t\t Price \t\t GST \t\t Total price ")
    count = 0
    for pr in range(len(lp)):
        print("5% gst rate\t\t", lp[pr], "\t\t\t", gstp[pr], "\t\t\t\t", tp[pr])

    for sr in range(len(ls)):
        print("18% gst rate\t\t", ls[sr], "\t\t\t", gsts[sr], "\t\t\t\t", ts[sr])

# print(ls)
# print(lp)
# print(ts)
# print(tp)
# print(gsts)
# print(gstp)