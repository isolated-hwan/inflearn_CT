import sys
# sys.stdin = open("input.txt", "rt")
n, k = map(int, input().split())
a = list(map(int, input().split()))
answer = []

for i in range(n):
    for j in range(i+1, n):
        for v in range(j+1, n):
            if a[v] + a[i] + a[j] in answer:
                continue
            else:
                answer.append(a[v] + a[i] + a[j])
answer.sort(reverse=True)
print(answer[k-1])