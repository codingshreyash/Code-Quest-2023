a = int(input())
i = 0
plist = []
while i < a:
    length = int(input())
    budget = input().split()
    expenses = input().split()
    difference = 0
    for j in range(length):
        difference += float(budget[j]) - float(expenses[j])
    plist.append((round(-1 * (difference / len(budget)), 2)))
    i += 1
for each in plist:
    print(f"{each:.2f}")