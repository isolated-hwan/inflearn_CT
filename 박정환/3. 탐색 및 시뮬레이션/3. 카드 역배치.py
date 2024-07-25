import sys
# sys.stdin=open("input.txt", "r")
a = [i for i in range (21)]

for _ in range(10):
    m, n = map(int, input().split())
    for i in range((n - m +1)//2):
        a[m + i], a[n - i] = a[n - i], a[m + i]
a.pop(0)
for x in a:
    print(x, end=' ')