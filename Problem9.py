def cardsVal(cardlist):
    if "ACE" in cardlist:
      cardlist.pop(cardlist.index("ACE"))
      cardlist.append("ACE")
    total = 0
    for i in range(len(cardlist)):
        name = cardlist[i].split("_")[0]
        if name.lower() == "ace" and total >= 11:
            total += 1
        elif name.lower() == "ace" and total < 11:
            total += 11
        elif name.isalpha():
            total += 10
        else:
           total += int(name)
    return total

a = int(input())
i = 0
plist = []
while i < a:
  ptotal = 0
  dtotal = 0
  player = input().split()
  dealer = input().split()
  ptotal = cardsVal(player)
  dtotal = cardsVal(dealer)
  if ptotal > 21 or (dtotal > ptotal and dtotal < 22):
    plist.append(f"Player Score: {ptotal} Dealer Score: {dtotal} Dealer Wins!")
  elif dtotal > 21 or (ptotal > dtotal and ptotal < 22):
    plist.append(f"Player Score: {ptotal} Dealer Score: {dtotal} Player Wins!")
  else:
    plist.append(f"Player Score: {ptotal} Dealer Score: {dtotal} Tie!")
  i += 1
for each in plist:
  print(each)