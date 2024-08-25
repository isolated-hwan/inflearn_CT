import sys
from collections import Counter
# sys.stdin=open("input.txt", "r")

a = input()
b = input()

a = dict(Counter(a))
b = dict(Counter(b))
if a != b:
    print("NO")
else:
    print("YES")