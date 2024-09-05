import sys
sys.stdin=open('input.txt', "r")

def DFS(level, sum, time_sum):
    global max_score
    if m < time_sum:
        return
    if level == n:
        if sum > max_score:
            max_score = sum
    else:
        DFS(level + 1, sum + score[level], time_sum + time[level])
        DFS(level + 1, sum, time_sum) 


n, m =  map(int, input().split())
score = []
time = []
for _ in range(n):
    a, b = map(int, input().split())
    score.append(a)
    time.append(b)
max_score = -21470000
DFS(0,0,0)
print(max_score)
