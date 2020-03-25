try:
    a = int(input("Enter any number : "))
    print(a)
    a /= 4
except ValueError as v:
    print("Exception Occurred\n", v)
finally:
    print("end of the block")
