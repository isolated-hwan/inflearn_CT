import sys
# sys.stdin = open("input.txt", "rt")
T = input()
answer = []

def a(x):
    cnt = 0  
    for i in range(1, x+1):
        if x % i == 0:
            cnt += 1
    return cnt     
    
for i in T:
    if i.isdigit():
        answer.append(i)

print(int(''.join(answer)))
print(a(int(''.join(answer))))