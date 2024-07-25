import sys
# sys.stdin=open("input.txt", "r")
answer = [list(map(int, input().split())) for _ in range(7)]
cnt = 0
for i in range(3):
    for j in range(7):
        a = answer[j][i:i+5]
        if a == a[::-1]:
            cnt+=1
        for k in range(2):
            if answer[i+k][j] != answer[i+5-k-1][j]:
                break
        else:
            cnt += 1
        
print(cnt)