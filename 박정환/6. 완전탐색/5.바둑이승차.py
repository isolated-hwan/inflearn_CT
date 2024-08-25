from collections import deque

def DFS(L, sum, tsum):
    global answer
    if sum + (total-tsum) < answer:
        return
    if sum > c:
        return
    if L == n:
        if sum > answer:
            answer = sum
        else:
            DFS(L+1, sum+a[L], tsum + a[L])
            DFS(L+1, sum, tsum + a[L])

c, n = map(int, input().split())
a = [0] * n
answer = -2147000000
for i in range(n):
    a[i] = int(input())
total = sum(a)
DFS(0, 0, 0)
print(answer)