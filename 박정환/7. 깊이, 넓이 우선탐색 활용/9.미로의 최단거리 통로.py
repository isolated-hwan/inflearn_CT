from collections import deque
dx = [-1, 0, 1, 0] # 좌, 하, 우, 상
dy = [0, -1, 0, 1]
a = [list(map(int, input().split())) for _ in range(7)]
dis = [[0] * 7 for _ in range(7)]
Q = deque()
Q.append((0,0))
a[0][0] = 1
while Q:
    tmp = Q.popleft()
    for i in range(4):
        x = tmp[0] + dx[i]
        y = tmp[1] + dy[i]
        if 0 <= x <= 6 and 0 <= y <= 6 and a[x][y] == 0:
            a[x][y] = 1
            dis[x][y] = dis[tmp[0]][tmp[1]] + 1
            Q.append((x, y))

if dis[6][6] == 0:
    print(-1)
else:
    print(dis[6][6])