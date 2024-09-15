import sys
sys.setrecursionlimit(10**6)

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]

def DFS(x, y, h):
    check[x][y] = 1
    for i in range(4):
        xx = x + dx[i]
        yy = y + dy[i]
        if 0 <= xx < n and 0 <= yy < n and check[xx][yy] == 0 and a[xx][yy] > h:
            DFS(xx, yy, h)

n = int(input())
cnt = 0
answer = 0
a = [list(map(int, input().split())) for _ in range(n)]
for h in range(100):
    check = [[0] * n for _ in range(n)]
    cnt = 0
    for i in range(n):
        for j in range(n):
            if check[i][j] == 0 and a[i][j] > h:
                cnt += 1
                DFS(i, j, h)
    answer = max(answer, cnt)
    if cnt == 0:
        break
print(answer)