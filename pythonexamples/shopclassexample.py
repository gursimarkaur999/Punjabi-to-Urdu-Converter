class Shop:
    inventory = 0
    flow = "True"

    def __init__(self):
        self.item = 0
        self.sold = 0
        self.store = 0
        self.s = ""

    def purchase(self, s):
        self.s = s
        print(self.s)
        self.item = int(input("Enter the items purchased: "))
        self.store = int(input("Enter the items purchased as storage: "))
        Shop.inventory += self.store

    def sale(self, s):
        self.s = s
        print(self.s)
        Shop.flow = "True"
        self.sold = int(input("Enter items sold: "))
        self.item -= self.sold
        while Shop.flow == "True":
            con = int(input("Enter 1 if you want items from inventory to be added: "))
            if con == 1:
                print("Items addition")
                temp = int(input("Enter the number of items to be added: "))
                self.item += temp
                Shop.inventory -= temp
                print("Stock is: ", self.item)
                print("Left over inventory is: ", Shop.inventory)
                Shop.flow = "False"
            elif con == 0:
                print("Stock is: ", self.item)
                Shop.flow = "False"
            else:
                print("Wrong choice. Enter 1 or 0")
                Shop.flow = "True"


shop1 = Shop()
shop2 = Shop()
shop1.purchase("SHOP 1")
shop2.purchase("SHOP 2")
shop1.sale("SHOP 1")
shop2.sale("SHOP 2")
