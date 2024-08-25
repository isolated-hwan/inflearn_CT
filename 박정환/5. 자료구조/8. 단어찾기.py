import sys
# sys.stdin=open("input.txt", "r")
n = int(input())
a = dict()
for i in range(n):
    k = input()
    a[k] = 1
# print(a)
for i in range(n-1):
    k = input()
    a[k] = 2
for i, v in a.items():
    if v == 1:
        print(i)
        break
