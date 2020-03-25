# write a program by creating objects to display student information
class Student:
    def __init__(self):
        self.name = input("Enter your name: ")
        self.roll_no = int(input("Enter the roll number: "))
        self.branch = input("Enter the branch of the student: ")
        self.marks = float(input("Enter the percentage number: "))

    def display(self):
        print("Name: ", self.name)
        print("Roll Number: ", self.roll_no)
        print("Branch: ", self.branch)
        print("Marks: ", self.marks)


obj1 = Student()
obj1.display()
