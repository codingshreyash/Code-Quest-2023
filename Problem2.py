#Done Submitted
a = int(input())
i = 0
plist = []
while i < a:
    planes = input().split()
    cass = int(planes[0])
    lead = int(planes[1])
    if lead > cass:
        plist.append(f"Lead Balloons Ltd sold {lead - cass} more aircraft")
    elif lead < cass:
        plist.append(f"Cassowary Craft sold {cass - lead} more aircraft")
    else:
        plist.append("Cassowary Craft and Lead Balloons Ltd sold the same number of aircraft")
    i += 1
for each in plist:
    print(each)