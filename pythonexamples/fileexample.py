# res = open("demo34.txt", 'w')
# res.write("\nData is written in file")
# res.close()
# print("Data is written in the file")


# res = open("demo34.txt", 'a')
# res.write("\nData is written in file")
# res.close()
# print("Data is written in the file")

# res = open("demo34.txt", 'r')
# data = res.read()
# res.close()
# print(data)

# import os
# os.renames('demo.txt', 'new.txt')

# import os
# """os.remove('new.txt')"""
# os.remove('doc.txt')

x = 0
with open('jsondoc.txt') as f:
   f.readlines()
   x = f.tell()

f = open('jsondoc.txt','a')
print(f.seek(x))