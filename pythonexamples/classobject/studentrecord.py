import pickle


class StudentRecord:
    dic = [{'id': 1, 'option': 'Add'},
           {'id': 2, 'option': 'Update'},
           {'id': 4, 'option': 'Search'},
           {'id': 3, 'option': 'Delete'}]
    school = "G_N_P_S"

    def __init__(self):
        self.Name = ""
        self.RollNo = ""

    def details(self):
        self.Name = input("Enter the name: ")
        self.RollNo = input("Enter the RollNo: ")

    def display(self):
        print(self.Name, "\n", self.RollNo, "\n", StudentRecord.school)

    def file_write(self):
        f = open("records.txt", 'ab')
        pickle.dump(self, f)
        f.close()

    @staticmethod
    def file_read():
        data = []
        print("The records of file are as follows: ")
        f = open("records.txt", 'rb')
        while True:
            try:
                data += [pickle.load(f)]
            except EOFError:
                break
        for i in data:
            print(i.Name, i.RollNo, StudentRecord.school)


def record():
    print("Record function")
    st = StudentRecord()
    st.details()
    st.file_write()
    con = int(input("enter 1 to enter one more record and 0 to exit: "))
    if con == 1:
        record()
    else:
        st.file_read()


def choice():
    for i in range(len(StudentRecord.dic)):
        print(StudentRecord.dic[i]['id'], "\t\t", StudentRecord.dic[i]['option'])
    cho = int(input("Enter your choice: "))
    print("Choice : ", cho)
    if cho == 1:
        print("Add")
        record()
    elif cho == 2:
        print("Update")
    elif cho == 3:
        print("Search")
    elif cho == 4:
        print("Delete")
    else:
        print("Wrong input")
        choice()


record()