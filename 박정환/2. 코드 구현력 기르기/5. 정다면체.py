import sys
from collections import Counter
# sys.stdin = open("input.txt", "r")
n, m = map(int, input().split())
answer = []
for i in range(1, n+1):
    for j in range(1, m+1):
        answer.append(i + j)

counter = Counter(answer)

max_value = max(counter.values())
result = [key for key, value in counter.items() if value == max_value]
result.sort
print(" ".join(map(str, result)))