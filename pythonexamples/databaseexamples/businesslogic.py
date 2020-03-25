class BusinessLogic:

    # @staticmethod
    # def table_check(cursor, t_name):
    #     cursor.execute("SHOW TABLES LIKE '%s'", t_name)
    #     result = cursor.fetchone()
    #     print(t_name)
    #     if result:
    #         print("Table exists")
    #         return True
    #     else:
    #         print("table doesn't exists")
    #         return False

    @staticmethod
    def create_table(cursor, conn, tb_name, li):
        statement = 'create table ' + tb_name + '('
        for i in range(len(li)):
            statement = statement + " " + str(li[i]) + ","
        statement = statement[:-1] + ');'
        cursor.execute(statement)
        conn.commit()

    @staticmethod
    def id_return(cursor, tb_name):
        statement = "select max(id) from" + tb_name + " ;"
        temp = cursor.execute(statement)
        return temp

    @staticmethod
    def data_insertion(cursor, conn, li):
        statement = "insert into employee(name, age, salary) values (%s, %s, %s)"
        cursor.execute(statement, li)
        conn.commit()

    @staticmethod
    def data_deletion(cursor, conn, id_no):
        statement = "delete from employee where id =" + str(id_no)
        cursor.execute(statement)
        conn.commit()

    @staticmethod
    def data_out(cursor):
        statement = "select * from employee"
        cursor.execute(statement)
        result = cursor.fetchall()

        for i in result:
            print(i)

    @staticmethod
    def data_update(cursor, conn, li, id_no):
        statement = "update employee set name = %s, age = %s, salary = %s where id = %s"
        li.append(id_no)
        cursor.execute(statement, li)
        conn.commit()

