ap= 150
pg=300
qa=int(input("Enter the quantity for apple: "))
qp=int(input("Enter the quantity for pomegranate: "))
price=(ap*qa)+(pg*qp)
print(price)
if(price<1000):
    if(price>500):
        dis=price*5/100
        print(dis)
        price=price-dis
    
elif(price>1000):
    dis=price*10/100
    price=price-dis
    print(dis,price)
    
else:
    print("No discount applied")
gst=price*5/100
print(gst)
tprice=price+gst
print(tprice)
