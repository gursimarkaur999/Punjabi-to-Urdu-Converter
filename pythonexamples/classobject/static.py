class A:

    a = 10
    __x = 3

    def __init__(self):
        print("constructor")
        self.a = 20
        print(self.a)
        print(A.__x)
        A.__x = 10
        print(A.__x)

    @staticmethod
    def gur(b):
        print(type(b))


class C:
    def __init__(self):
        print("C")


class B(C, A):
    def __init__(self):
        print("con of B")

        A.__init__(self)
        C.__init__(self)
        self.a = 30
        self.b = 300

    def show(self):
        print("show method in B")
        print(self.b)
        print(self.a)


obj = B()
obj.show()
print(obj.a)
obj.b = 40
obj.a = 4000
print(getattr(obj, 'b'))
