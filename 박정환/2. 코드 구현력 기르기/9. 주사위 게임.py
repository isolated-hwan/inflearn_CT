import sys
# sys.stdin = open("input.txt", "r")
n = int(input())
answer = []

for _ in range(n):
    answer.append(list(map(int, input().split())))


result = []
sum = 0
for i in answer:
    a, b, c = map(int, i)
    # print(a, b, c)
    if a == b and b ==c:
        sum = 10000 + a * 1000
    elif a == b or a == c:
        sum = 1000 + (a * 100)
    elif b == c:
        sum = 1000 + (a * 100)
    else:
        sum = c * 100
    result.append(sum)
print(max(result))
        

        

