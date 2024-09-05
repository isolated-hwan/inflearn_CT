import sys
sys.stdin = open('input.txt', 'r')
def DFS(level, sum):
    global cnt
    if T < sum:
        return
    if level == k:
        if sum == T:
            cnt += 1
    else:
        for i in range(n[level] + 1):
            DFS(level + 1, sum + (i * p[level]))



T = int(input())
k = int(input())
p = []
n = []
for _ in range (k):
    a, b = map(int, input().split())
    p.append(a)
    n.append(b)
cnt = 0
DFS(0,0)
print(cnt)