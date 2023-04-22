a = int(input())
i = 0
plist = []
while i < a:
  indlist = []
  null = input().split()
  thirds = input().split()
  for each in range(len(null)):
    if (float(null[each]) >= .6 and float(null[each]) <= .85) and (float(thirds[each]) >= .6 and float(thirds[each]) <= .85):
      indlist.append(each)
  if len(indlist) == 1:
    plist.append(f"A multipaction event was detected at time index {indlist[0]}.")
  elif not indlist:
    plist.append("No multipaction events detected.")
  else:
    new_indlist = [str(i) for i in indlist]
    plist.append(f"{len(indlist)} multipaction events were detected at time indices: {' '.join(new_indlist)}.")
  i += 1
for each in plist:
  print(each)