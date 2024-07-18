import sys
# sys.stdin = open("input.txt", "rt")
n = int(input())
answer = list(map(int, input().split()))

avg = int(sum(answer)/len(answer) + 0.5) 

min = 2147000000
for i , x in enumerate (answer):
    diff = abs((avg) - x)
    if diff < min:
        min = diff
        score = x
        idx = i+ 1
    elif diff == min:
        if x > score:
            score = x
            idx = i+1
        
print(avg, idx)


