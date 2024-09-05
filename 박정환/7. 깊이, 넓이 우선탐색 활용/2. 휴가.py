import sys
sys.stdin=open('input.txt', "r")

def DFS(level, sum):
    global max_score
    if level == n+1:
        if sum > max_score:
            max_score = sum
    else:
        if level + t[level] <= n+1:
            print("if 문", level, sum)
            DFS(level+t[level], sum+p[level])
        print("여기", level, sum)
        DFS(level+1, sum)


n = int(input())
p = []
t = []
for _ in range(n):
    a, b = map(int, input().split())
    t.append(a)
    p.append(b)
max_score = -21470000
t.insert(0,0)
p.insert(0,0)
DFS(1, 0)
print(max_score)
