from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
n = int(input())
a = [list(map(int, input().split())) for _ in range(n)]
check = [[0] * n for _ in range(n)]
sum = 0
Q = deque()
check[n//2][n//2] = 1
sum += a[n//2][n//2]
Q.append((n//2, n//2))
level = 0

while True:
    if level == n//2:
        break
    size = len(Q)
    for i in range(size):
        tmp = Q.popleft()
        for j in range(4):
            x = tmp[0] + dx[j]
            y = tmp[1] + dx[j]
            if check[x][y] == 0:
                sum += a[x][y] 
                check[x][y] = 1
                Q.append((x, y))
    level += 1

print(sum)
