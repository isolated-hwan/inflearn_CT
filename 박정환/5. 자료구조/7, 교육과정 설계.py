import sys
from collections import deque
sys.stdin=open("input.txt", "r")
a = input()
n = int(input())

for i in range(n):
    answer = input()
    dq = deque(a)
    for x in answer:
        if x in dq:
            if x != dq.popleft():
                print("#%d NO" %(i+1))
                break
    else:
        if len(dq) == 0:
            print("#%d YES" %(i+1))
        else:
            print("#%d NO" %(i+1))


           


