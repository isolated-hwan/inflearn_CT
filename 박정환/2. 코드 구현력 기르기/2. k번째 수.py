import sys
# sys.stdin = open("input.txt", "rt")
T = int(input())

for i in range(T):
    N, s, e , k = map(int, input().split())

    answer = list(map(int, input().split()))
    answer = sorted(answer[s-1:e])
    print(f"#{i+1} {answer[k-1]}")

