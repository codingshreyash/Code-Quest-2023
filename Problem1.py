#Done Submitted 
a = int(input())
i = 0
plist = []
while i < a:
    nimo = input().split()
    plist.append(nimo.index("Nimo") + 1)
    i += 1
for each in plist:
    print(each)

