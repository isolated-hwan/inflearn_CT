import sys
# sys.stdin = open("input.txt", "r")
n = input()
answer = list(map(int, input().split()))
result = []

def digit_sum(x):
    sum = 0
    for j in x:
        sum += int(j)
    return sum

for i in answer:
    result.append([digit_sum(str(i)), i])

result.sort(key=lambda x: (-x[0], answer.index(x[1])))
print(result[0][1])


