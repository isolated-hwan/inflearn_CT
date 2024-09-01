def DFS(L):
    global answer
    if L == m:
        for i in range(L):
            print(res[i], end = ' ')
        print()
        answer += 1
    else:
        for i in range(1, n+1):
            if a[i] == 0:
                a[i] = 1
                res[L] = i
                print('res', res)
                print('a', a)
                DFS(L+1)
                print(a)
                print(L)
                a[i] = 0
                print(a)
                print(res)

n, m = map(int, input().split())
res = [0] * n
a = [0] * (n+1)
answer = 0
DFS(0)
print(answer)