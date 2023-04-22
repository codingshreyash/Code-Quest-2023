a = int(input())
i = 0
plist = []
while i < a:
  num_fields, email_length = input().split()
  num_fields, email_length = int(num_fields), int(email_length)
  replacements = {}
  for j in range(num_fields):
    temp = input().split(':')
    temp[1].strip()
    replacements[f"[{temp[0]}]"] = temp[1]
  for k in range(email_length):
    line = input()
    for each in replacements:
      if each in line:
        line = line.replace(each, replacements[each].strip())
    plist.append(line)
  i += 1
for each in plist:
  print(each)
