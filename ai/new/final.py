import new.new1
import new.New2


class Final(new.New2.New2, new.new1.New1):

    def d(self, a, b):
        super().d(5, 1)
        new.new1.New1.d(self, 8, 7)
        print("Final function")


f = Final()
f.d(43, 54)
