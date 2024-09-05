import sys
sys.stdin=open('input.txt', "r")
def DFS(level):
    global res
    if level == n:
        diff = max(person) - min(person) # 총액이 가장 큰 사람과 가장 작은 사람의 차
        print("d: ", diff)
        if res > diff:
            temp = set() # 중복 체크를 위한 것
            for i in person:
                temp.add(i)
            if len(temp) == 3:
                res = diff
    else:
        for i in range(3):
            person[i] += coin[level]
            DFS(level + 1)           
            person[i] -= coin[level]
n = int(input())
coin = []
person = [0] * 3
res = 2147000000
for _ in range(n):
    coin.append(int(input()))
# print(coin)
# print(person)
DFS(0)
print(res)