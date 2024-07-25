import sys
# sys.stdin = open("input.txt", "rt")
n , m= map(int, input().split())
a = list(map(int, input().split()))
cnt = 0
start = 0
end = 0
current_sum = 0

while end < n:
    current_sum += a[end]

    while current_sum > m:
        current_sum -= a[start]
        start += 1
        
    if current_sum == m:
        cnt += 1

    end += 1
print(cnt)


