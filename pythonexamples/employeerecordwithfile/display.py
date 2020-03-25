import ast
li = []


def display():
    print("display function")
    fo = open("doc.txt", 'r')
    while True:
        temp = fo.readline()
        if temp == "":
            break
        else:
            data = ast.literal_eval(temp)
            li.append(data)
    for i in li:
        print(i)
    li.clear()
    # file = open("doc.txt", 'a')
    # file.write(l)
    # file.close()n

