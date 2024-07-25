import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
a = []
for _ in range(n):
    a.append(list(map(int, input().split())))

answer1 = max([sum(i) for i in a])
answer2 = 0
for i in range(n):
    l = 0
    for j in range(n):
        l += a[j][i]
    if l > answer2:
        answer2 = l
answer3 = answer4 = 0
for i in range(n):
    l = 0
    answer3 +=a[i][i]
    answer4 +=a[i][n-i-1]
    if l > answer3:
        answer3 = l
    if l > answer4:
        answer4 = 1

print(max(answer1, answer2, answer3, answer4))
