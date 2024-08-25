import sys
# sys.stdin=open("input.txt", "r")
a=input()
stack=[]
res=''
for x in a:
    if x.isdecimal():
        res+=x
    else:
        if x=='(':
            stack.append(x)
            # print(stack)
        elif x=='*' or x=='/':
            while stack and (stack[-1]=='*' or stack[-1]=='/'):
                res+=stack.pop()
                # print(res)
            stack.append(x)
            # print(stack)
        elif x=='+' or x=='-':
            while stack and stack[-1]!='(':
                res+=stack.pop()
                # print(res)
            stack.append(x)
            # print(stack)
        elif x==')':
            while stack and stack[-1]!='(':
                res+=stack.pop()
                # print(res)
            stack.pop()
            # print(stack)
while stack:
    res+=stack.pop()
print(res)