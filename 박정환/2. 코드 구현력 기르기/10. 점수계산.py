import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
answer = list(map(int, input().split()))

a = []

cnt = 0
for i in range(0, n):
    if answer[i] == 1:
        if len(a) == 0:
            cnt += 1
            a.append(cnt)
        elif answer[i] == answer[i-1]:
            cnt += 1
            a.append(cnt)
        else:
            cnt += 1
            a.append(cnt)
    elif answer[i] == 0:
        cnt = 0
        a.append(cnt)
print(sum(a))