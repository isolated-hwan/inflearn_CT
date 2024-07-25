import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
a = []

for _ in range(n):
    a.append(input().lower())
for i in range (len(a)):
    if (a[i]) == (a[i][::-1]):
        print(f"#{i+1} YES")
    else:
        print(f"#{i+1} NO")