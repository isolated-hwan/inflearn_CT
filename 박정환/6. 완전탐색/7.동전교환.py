def DFS(L, sum):
    global answer
    if L > answer:
        return
    if sum > m:
        return
    if sum == m:
        if L < answer:
            answer = L
    else:
        for i in range(n):
            DFS(L+1, sum+a[i])


n = int(input())
a = list(map(int, input().split()))
m = int(int())
answer = 2147000000
a.sort(reverse=True)
DFS(0, 0)
print(answer)