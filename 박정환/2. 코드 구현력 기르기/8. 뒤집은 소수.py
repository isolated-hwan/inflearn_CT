import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
answer = list(map(int, input().split()))
result = []

def reverse(x):
    x = x[::-1]
    return int(x)

def isPrime(x):
    for i in range(2, x):
        if x % i == 0:
            return False
    return True # 소수임

for i in answer:

    x = reverse(str(i))
    if isPrime(x) and x > 1:
        result.append(x)

print(" ".join(map(str, result)))
