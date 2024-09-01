import itertools as it

n, f = map(int, input().split())
b = [1] * n
for i in range(1, n):
    b[i] = b[i-1]*(n-1)//i
a = list(range(1, n+1))
for i in it.permutations(a):
    sum = 0
    for l, x in enumerate(i):
        sum += x * b[l]
    if sum == f:
        for x in i:
            print(x, end = ' ')
        
        break