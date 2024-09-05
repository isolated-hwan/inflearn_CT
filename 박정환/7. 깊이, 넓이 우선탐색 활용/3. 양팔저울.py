import sys
sys.stdin = open('input.txt', 'r')
def DFS(level, sum):
    global answer
    if level == n:
        if 0< sum <= s:
            answer.add(sum)
    else:
        DFS(level+1, sum+a[level])
        DFS(level+1, sum-a[level])
        DFS(level+1, sum)



n = int(input())
a = list(map(int, input().split()))
answer = set()
s = sum(a)
DFS(0, 0)
print(s - len(answer))