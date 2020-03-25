import databaseexamples.dbconnection
import databaseexamples.businesslogic
choice = [{'id': 1, 'option': 'Table Creation'},
          {'id': 2, 'option': 'Insertion'},
          {'id': 3, 'option': 'Deletion'},
          {'id': 4, 'option': 'Data Printing'}]


class UserInput:
    db_obj = databaseexamples.dbconnection.DbConnect.get_connection()
    db_cursor = db_obj.cursor()
    full_string = []
    id_value = 0
    id_input = ""

    def __init__(self):
        print(UserInput.db_obj, "\n", UserInput.db_cursor)

    def ch_print(self):
        for i in choice:
            print(i['id'], "\t\t\t", i['option'])
        ch = int(input("Enter your choice: "))
        self.choice_func(ch)

    @staticmethod
    def data_enter():

        name = input("Enter the name of the employee: ")
        age = int(input("Enter the age: "))
        salary = int(input("Enter the salary given: "))
        li = [name, age, salary]
        databaseexamples.businesslogic.BusinessLogic.data_insertion(UserInput.db_cursor,
                                                                    UserInput.db_obj, li)

    def choice_func(self, ch):
        if ch == 1:
            print("data updation")
            UserInput.id_input = input("enter the id to update it: ")
            name = input("Enter the name of the employee: ")
            age = int(input("Enter the age: "))
            salary = int(input("Enter the salary given: "))
            li = [name, age, salary]
            databaseexamples.businesslogic.BusinessLogic.data_update(UserInput.db_cursor, UserInput.db_obj, li,
                                                                     UserInput.id_input)
            # print("Table Creation")
            # cr_table = input("Enter the name of table: ")
            # col_no = int(input("Enter the numbers of columns you want to add: "))
            # while col_no != 0:
            #     col_name = input("Enter the column name: ")
            #     data_type = input("Enter the data type: ")
            #     con = int(input("Do you want to have any extra info(PRIMARY KEY OR NOT NULL). "
            #                     "\n Press 1 to enter and 0 to not :"))
            #     if con == 1:
            #         print("PRIMARY KEY \n "
            #               "UNIQUE \n "
            #               "INDEX \n "
            #               "AUTO_INCREMENT \n")
            #         sp_char = input("Enter any of above: ")
            #         temp_string = [col_name, data_type,sp_char]
            #
            #     else:
            #         temp_string = [col_name, data_type]
            #
            #     UserInput.full_string.append(temp_string)
            #     col_no -= 1
            # temp = UserInput.full_string
            # databaseexamples.businesslogic.BusinessLogic.create_table(UserInput.db_cursor,
            #                                                           UserInput.db_obj, cr_table, temp)
        elif ch == 2:
            print("Insertion")
            # while True:
            #     table_name = input("Enter table name in which you want to insert data: ")
            #     tb_flag = databaseexamples.businesslogic.BusinessLogic.table_check(UserInput.db_cursor, table_name)
            #     if tb_flag:
            #         print("Table selected...\n\n", table_name)
            #         break
            #     else:
            #         print("Re-enter any other table name: ")
            #         continue
            # #id = databaseexamples.businesslogic.BusinessLogic.id_return(UserInput.db_cursor, table_name)
            UserInput.data_enter()
        elif ch == 3:
            print("Deletion")
            UserInput.id_input = input("enter the id to delete it: ")
            databaseexamples.businesslogic.BusinessLogic.data_deletion(UserInput.db_cursor,
                                                                       UserInput.db_obj, UserInput.id_input)
        elif ch == 4:
            print("Data Printing")
            databaseexamples.businesslogic.BusinessLogic.data_out(UserInput.db_cursor)
        else:
            print("Wrong choice")
            self.ch_print()


obj = UserInput()
obj.ch_print()