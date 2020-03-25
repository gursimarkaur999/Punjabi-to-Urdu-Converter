# # class Queue():
# a = zip([1, 2, 3], [4, 5, 6])
# print(a)
#
#
#
#
#
#
# import sys
# # import getopt
# print(sys.argv)
# print(len(sys.argv))
# for i in sys.argv:
#     print(i)
#     print(type(i))

# print('''Three single quote's''', """Three doubl'''''e quotes""")
# print('"khkdshkshdsd\'sdd\'sds\'d\'s\'vcdcdxnjcd"')
# print(r'c:\dfdf\\ef\dcs\s\tscs\nccx')
# print('\nc:sdrefs\tdssd')
# a = b'abc'
# b = a.replace(b'a',b'b')
# print(b)
# a = 'abc'
# b = a.replace('a', 'b')
# print(b)
#
# a ='a,d,f,g,h,d,s,c,e'
# t = a.split(',')
# print(t)
# print('01\t012\t0123\t01234'.expandtabs())#default tab size
# print("The sum of 1 + 2 is {0}".format(1+2))
# print("it is {0} xjjhd {1}".format(t, 3))
#
#
#
# class Default(dict):
#     def __missing__(self, key):
#         return key
#
# # used if mapping is dictionary class otherwise normal dict
# print("sijsdiisd {country} sdsjisjisd ids fisd s {name}".format(name="gursimar", country="India"))
# print("sijsdiisd {country} sdsjisjisd ids fisd s {name}".format_map(Default(name="gursimar")))
#
#a = 10
#assert a>11

#
# def fun1(s):
#     print('local fun1', s)
#
#     def fun2(d):
#         nonlocal s
#         s = 'adsd'
#         print('nonlocal fun2', s)
#         print(d)
#     fun2('dssdf')
#
#
# fun1('asdasd')

# def temp(*args, **fcnvjf):
#     print(type(args))
#     print(type(fcnvjf))
#     for i in args:
#         print(i)
#     for j in fcnvjf.keys():
#         print(j)
#     for k in fcnvjf.values():
#         print(k)
#
# temp(20,340, 45,596,495,t = 'fdf',j = 34, k ='s')

# def kwd_only_ard(*, arg):
#     print(arg)
#
#
# kwd_only_ard(arg='sdfsdf')
#
#
# def combined_example(pos_only,/, standard, *, kwd_only):
#     print(pos_only, standard, kwd_only)
#
#
# combined_example(34,23,standard='sds',kwd_only ='ffdss')

#function annotation means to tell what datatype the input will be and return datatype
#but it is only for pragrammers knowledge however has no effect on the input

# first_name = 'Gursimar'
# last_name = 'Kaur'
#
# print('my first name is {} and second name is {}'.format(first_name, last_name))
# print(f'my first name is {first_name} and second name is {last_name}')
#
# while True:
#     try:
#         x = int(input("Please enter a number: "))
#         break
#     except ValueError:
#         print("Oops!  That was no valid number.  Try again...")
#
#
# class A:
#     def __init__(self):
#         print("Object created of A")
#     def h(self):
#         print("hello A!")
#     def append_fun(self, a):
#         self.t =[]
#         self.t.append(a)
#
# class B(A):
#     def __init__(self):
#         super().__init__()
#         print("Object created of B")
#     def h(self):
#         print("hello B!")
#
#
# b_obj = B()
# a_obj = A()
# b_obj.h()
# A.h(b_obj)
# a_obj.append_fun('df')
# a2_obj = A()
# a2_obj.append_fun('dsf')
# print(a_obj.t)
# print(a2_obj.t)


# def f1(self, x, y):
#     return min(x, x+y)
# class C:
#     f = f1
#
#     def g(self):
#         return 'hello world'
#
#     h = g
# obj = C()
# minimum_value = C.f(obj, 30, 40)
# message = obj.h()
# print(minimum_value)
# print(message)

# class A:
#     h ='hjgj'
#     @staticmethod
#     def new():
#         print("vhjgjgj", A.h)
#
#     @classmethod
#     def s(cls):
#         print('sdsd')
#
# class B:
#     def h(self, a):
#         self.a = a
#         print(self.a)
#
# class C(A,B):
#     def c(self,b):
#         self.b = b
#         print(self.b)
#
# obj = C()
# obj.s()
# obj.c(45)
# aobj = A()
# aobj.new()
# print(aobj.__dict__)

# my ='ddsnkjdsk0 asd asd sa das d a sd'
# for word in my:
#     print(word)
#

from gtts import gTTS
# import os
# text = "Global warming is the long-term rise in the average temperature of the Earth’s climate system"
# language = "en"
# speech = gTTS(text=text, lang=language, slow=False)
# speech.save("text.mp3")
# os.system("start text.mp3")

# import pyttsx3
#
# engine = pyttsx3.init()
# engine.say("hello crazy programmer")
# engine.setProperty('rate', 120)
# engine.setProperty('volume', 0.9)
# engine.runAndWait()
# import pyttsx3
#
# def onStart(name):
#    print('starting', name)
#
# def onWord(name, location, length):
#    print('word', name, location, length)
#
# def onEnd(name, completed):
#    print('finishing', name, completed)
#
# engine = pyttsx3.init()
# engine.connect('started-utterance', onStart)
# engine.connect('started-word', onWord)
# engine.connect('finished-utterance', onEnd)
# engine.say('The quick brown fox jumped over the lazy dog.')
# engine.runAndWait()
