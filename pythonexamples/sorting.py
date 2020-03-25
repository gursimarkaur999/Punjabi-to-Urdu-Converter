# l = [9, 5, 79, 30, 45, 10, 2, 1, 6, 8]
# for i in range(1,len(l)):
#     for j in range(i):
#         if l[i]<l[j]:
#             temp=l[i]
#             for k in range(j,j+1):
#                 l[i]=l[j]
#                 l[j]=temp
#         else:
#             continue
#
# print("Insertion sort is : ",l)
# print("DYNAMIC INSERTION SORT\n\n\n\n")
# ind=input("Enter elements for list (separated  by comma) : ").split(",")
# print(ind)
# m=0
# for t in ind:
#     ind[m]=int(t)
#     m=m+1
#
# for i in range(1,len(ind)):
#     for j in range(i):
#         if ind[i]<ind[j]:
#             temp=ind[i]
#             for k in range(j,j+1):
#                 ind[i]=ind[j]
#                 ind[j]=temp
#         else:
#             continue
#
# print("Insertion sort is : ", ind)
#
# Selection Sort
# t=[6,9,3,4,7,1,33]
# print(t)
#
# for r in range(len(t)):
#     m = t[r]
#     for i in range(r, len(t)):
#         if m>t[i]:
#             m=t[i]
#             t[i]=t[r]
#             t[r] = m
#     print(m)
# print(t)
#


