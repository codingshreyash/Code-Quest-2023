a = int(input())
i = 0
plist = []
while i < a:
    b = input()
    costs = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26]
    b = b.split()
    cost = int(b[0])
    if cost != 1:
        costs.extend(costs[:cost - 1])
        for each in range(cost - 1):
            costs.pop(0)
    b = int(b[1])
    j = 0
    alphabet = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z']
    while j < b:
        total = 0
        word = list(input())
        for each in word:
            total += costs[alphabet.index(each)]
        if total == 100:
            plist.append(f"WINNER {cost}: {''.join(word)}")
        j += 1
    i += 1
for each in plist:
    print(each)

