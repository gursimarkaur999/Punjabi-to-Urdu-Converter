s=input("Enter any string : ")
s=s.lower()
print("Lower case is : ",s)
l=['a','e','i','o','u']

count=0
for i in range(5):
    for r in range(s):
        if(l[i]==s[r]):
            count=count+1
print("Count value : ",count)
