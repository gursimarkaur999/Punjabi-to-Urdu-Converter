def search(ts, l):
    print("search function", ts)
    for i in range(len(l)):
        if l[i]['mno'] == ts:
            print(l[i]['id'], " ", l[i]['name'], " ", l[i]['mno'], " ", l[i]['add'])

