# from .code1 import Code1
#
# o = Code1()
# print("ghg")
# import code.code2


def scope_test():
    def do_local():
        spam = "local spam"

    def do_nonlocal():
        nonlocal spam
        spam = "nonlocal spam"

    def do_global():
        global spam
        spam = "global spam"

    class A:

        def h(self):
            print("bhdjsjdhdskdhks")
    spam = "test spam"
    do_local()
    print("After local assignment:", spam)
    do_nonlocal()
    print("After nonlocal assignment:", spam)
    do_global()
    print("After global assignment:", spam)
    obj = A()
    print(obj)
    obj.h()
    return A


t = scope_test()
print(type(t))
obj = t()
obj.h()
print("In global scope:", spam)
obj.h()
a=11
if a>10:
    class B(t):
        def f(self):
            print("hgjgj")
    final = B
else:
    final = t


temp = final()
temp.f()
final.f(temp)
final.h(temp)


