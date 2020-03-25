# # write a program to solve water jug problem
#
# # This function is used to initialize the
# # dictionary elements with a default value.
# from collections import defaultdict
#
# # jug1 and jug2 contain the value
# # for max capacity in respective jugs
# # and aim is the amount of water to be measured.
# jug1, jug2, aim = 3, 5, 4
#
# # Initialize dictionary with
# # default value as false.
# visited = defaultdict(lambda: False)
#
#
# # Recursive function which prints the
# # intermediate steps to reach the final
# # solution and return boolean value
# # (True if solution is possible, otherwise False).
# # amt1 and amt2 are the amount of water present
# # in both jugs at a certain point of time.
# def waterJugSolver(amt1, amt2):
#     # Checks for our goal and
#     # returns true if achieved.
#     if (amt1 == aim and amt2 == 0) or (amt2 == aim and amt1 == 0):
#         print(amt1, amt2)
#         return True
#
#     # Checks if we have already visited the
#     # combination or not. If not, then it proceeds further.
#     if visited[(amt1, amt2)] == False:
#         print(amt1, amt2)
#
#         # Changes the boolean value of
#         # the combination as it is visited.
#         visited[(amt1, amt2)] = True
#
#         # Check for all the 6 possibilities and
#         # see if a solution is found in any one of them.
#         return (waterJugSolver(0, amt2) or
#                 waterJugSolver(amt1, 0) or
#                 waterJugSolver(jug1, amt2) or
#                 waterJugSolver(amt1, jug2) or
#                 waterJugSolver(amt1 + min(amt2, (jug1 - amt1)),
#                                amt2 - min(amt2, (jug1 - amt1))) or
#                 waterJugSolver(amt1 - min(amt1, (jug2 - amt2)),
#                                amt2 + min(amt1, (jug2 - amt2))))
#
#     # Return False if the combination is
#     # already visited to avoid repetition otherwise
#     # recursion will enter an infinite loop.
#     else:
#         return False
#
#
# print("Steps: ")
#
# # Call the function and pass the
# # initial amount of water present in both jugs.
# waterJugSolver(0, 0)

# x = 0
# y = 0
# m = 4
# n = 3
# print("Initial state = (0,0)")
# print("Capacities = (4,3)")
# print("Goal state = (2,y)")
# while x != 2:
#   r = int(input("Enter rule"))
#   if(r == 1):
#     x = m
#   elif(r == 2):
#     y = n
#   elif(r == 3):
#     x = 0
#   elif(r == 4):
#     y = 0
#   elif(r == 5):
#     t = n - y
#     y = n
#     x -= t
#   elif(r == 6):
#     t = m - x
#     x = m
#     y -= t
#   elif(r == 7):
#     y += x
#     x = 0
#   elif(r == 8):
#     x += y
#     y = 0
#   print (x, y)

class Waterjug:


    def __init__(self,am,bm,a,b,g):
        self.a_max = am;
        self.b_max = bm;
        self.a = a;
        self.b = b;
        self.goal = g;


    def fillA(self):
        self.a = self.a_max;
        print ('(', self.a, ',',self.b, ')')


    def fillB(self):
        self.b = self.b_max;
        print ('(', self.a, ',', self.b, ')')


    def emptyA(self):
        self.a = 0;
        print ('(', self.a, ',', self.b, ')')


    def emptyB(self):
        self.b = 0;
        print ('(', self.a, ',', self.b, ')')


    def transferAtoB(self):
        while (True):

            self.a = self.a - 1
            self.b = self.b + 1
            if (self.a == 0 or self.b == self.b_max):
                break
        print ('(', self.a, ',', self.b, ')')


    def main(self):
        while (True):

            if (self.a == self.goal or self.b == self.goal):
                break
            if (self.a == 0):
                self.fillA()
            elif (self.a > 0 and self.b != self.b_max):
                self.transferAtoB()
            elif (self.a > 0 and self.b == self.b_max):
                self.emptyB()



waterjug=Waterjug(5,3,0,0,4);
waterjug.main();