from collections import deque
dx = [-1, -1, 0, 1, 1, 1, 0, -1]
dy = [0, 1, 1, 1, 0, -1, -1, -1]
n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
cnt = 0
Q = deque()
for i in range(n):
    for j in range(n):
        if a[i][j] == 1:
            a[i][j] = 0
            Q.append((i, j))
            while Q:
                tmp = Q.popleft()
                for k in range(8):
                    x = tmp[0] + dx[k]
                    y = tmp[1] + dy[k]
                    if 0<=x <n and 0 <=y<n and a[x][y] ==1:
                        a[x][y] = 0
                        Q.append((x,y))
            cnt += 1
print(cnt)