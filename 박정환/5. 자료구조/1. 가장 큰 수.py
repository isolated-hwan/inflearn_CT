import sys
# sys.stdin=open("input.txt", "rt")
num, m = map(int, input().split())
num = list(map(int, str(num)))
answer = []
for x in num:
    while answer and m > 0 and answer[-1] < x:
        answer.pop()
        m -= 1
    answer.append(x)
if m != 0:
    answer = answer[:-m]
res = ''.join(map(str, answer))
print(res)