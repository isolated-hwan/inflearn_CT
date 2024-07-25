import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
a1 = list(map(int, input().split()))
n2 = int(input())
a2 = list(map(int, input().split()))

answer = []
a = []

for i in a1:
    a.append(i)

for i in a2:
    a.append(i)

print(" ".join(map(str, sorted(a))))