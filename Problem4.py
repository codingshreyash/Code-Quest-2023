a = int(input())
i = 0
plist = []
while i < a:
    b = input().split()
    accounts = int(b[0])
    purchases = int(b[1])
    j = 0
    bank = {}
    while j < accounts:
        amount = input().split()
        bank[amount[0]] = int(amount[1])
        j += 1
    j = 0
    while j < purchases:
        temp = input().split()
        category = temp[0]
        subadd = temp[1]
        cost = int(temp[2])
        if subadd == '-':
            if cost > bank[category]:
                plist.append("NO")
            else:
                bank[category] -= cost
                plist.append("YES")
        if subadd == '+':
            bank[category] += cost
            plist.append("YES")
        j += 1

    i += 1
for each in plist:
    print(each)