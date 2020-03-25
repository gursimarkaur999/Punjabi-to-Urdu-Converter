class Rectangle:

    @staticmethod
    def length():
        l = int(input("Enter the value of length: "))
        return l

    @staticmethod
    def breadth():
        b = int(input("Enter the value of breadth: "))
        return b

    def area(self):
        length = self.length()
        breadth = self.breadth()
        area = length*breadth
        print("area of rectangle: ", area)


r = Rectangle()
r.area()
