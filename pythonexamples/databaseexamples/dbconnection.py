import mysql.connector


class DbConnect:

    @staticmethod
    def get_connection():
            db_con = mysql.connector.connect(
                host="localhost",
                user="root",
                passwd="",
                database="mydatabase"
            )
            return db_con
