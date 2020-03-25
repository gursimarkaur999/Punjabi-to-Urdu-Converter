import ast
import os


class Employee:
    count = 1
    sr_no = 1
    t = []
    a = []

    def details_employ(self):
        print("Employee details: ")
        user_name = input("Enter the name: ")
        age = int(input("Enter the age: "))
        data = {'sr_no': Employee.sr_no, 'name': user_name, 'age': age}
        self.file_write(str(data))
        Employee.count += 1
        Employee.sr_no += 1

    def file_write(self, d):
        f = open("object_user_age.txt", 'a')
        f.write(str(d) + "\n")
        f.close()

    def file_read(self):
        if os.stat("object_user_age.txt").st_size == 0:
            return
        else:
            file = open("object_user_age.txt", 'r')
            while True:
                d = file.readline()
                if d == "":
                    break
                else:
                    print(d)
                    temp = ast.literal_eval(d)
                    self.li.append(temp)
            for i in range(len(self.li)):
                Employee.t.append(int(self.li[i]['sr_no']))
                Employee.a.append(int(self.li[i]['age']))
            Employee.sr_no = max(Employee.t)
            Employee.sr_no += 1

    def __init__(self):
        self.li = []
        self.file_read()
        no = int(input("Enter the number of records you want to enter : "))
        self.no = no
        while self.no >= Employee.count:
            self.details_employ()


obj = Employee()
