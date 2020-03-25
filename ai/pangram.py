# write a python function to check whether a string is pangram or not
# Python3 program to
# Check if the string is pangram


def ispangram(str):
    alphabet = "abcdefghijklmnopqrstuvwxyz"
    for char in alphabet:
        if char not in str.lower():
            return False

    return True


# Driver code
string = 'the quick brown fox jumps over the lazy dog'
if ispangram(string) is True:
    print("Yes")
else:
    print("No")