dx = [-1, 0, 1, 0] # 좌, 하, 우, 상
dy = [0, -1, 0, 1]

def DFS(x, y):
    global cnt
    if x == ex and y == ey:
        cnt += 1
    else:
        for i in range(4):
            xx = x + dx[i]
            yy = y + dy[i]
            if 0<= xx <= n and 0 <= yy <= n and check[xx][yy] == 0 and a[xx][yy] > a[x][y]:
                check[xx][yy] = 1
                DFS(xx, yy)
                check[xx][yy] = 0

n = int(input())
a = [[0] * n for _ in range(n)]
check = [[0] * n for _ in range(n)]
max = -2147000000
min = 2147000000
for i in range(n):
    tmp = list(map(int, input().split()))
    for j in range(n):
        if tmp[j] < min:
            min = tmp[j]
            sx = i # 시작 지점
            sy = j
        if tmp[j] > max: # 가장 높은 지점
            max = tmp[j]
            ex = i # 종착 지점
            ey = j
        a[i][j] = tmp[j]
check[sx][sy] = 1
cnt = 0
DFS(0,0)