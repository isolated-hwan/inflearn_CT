from collections import deque
n, k = map(int, input().split())
a = list(range(1, n+1))
a = deque(a)
while a:
    for _ in range(k-1):
        c = a.popleft()
        a.append(c)
    a.popleft()
    if len(a) == 1:
        print(a[0])
        break

