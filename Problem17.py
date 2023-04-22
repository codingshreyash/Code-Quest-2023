plist = []
for xyz in range(int(input())):
    state = "A"
    instructions = []
    for i in range(int(input())):
        instruction = input()
        instruction = instruction.split(",")
        for i in range(len(instruction)):
             instruction[i] = list(instruction[i])[1]
        instructions.append(instruction)
    belt = input().split()
    iterations = int(input())
    ind = (len(belt) - 1) // 2
    last_value, last_state = "x", "x"
    k = 0
    j = 0
    while j < iterations:
    #for j in range(iterations):
        if j == 0:
            pass
        else:
            if last_state != state or last_value != belt[ind]:
                k += 1
        current_instruction = instructions[k % len(instructions)]
        last_state = state
        last_value = belt[ind]
        if state == current_instruction[0] and belt[ind] == current_instruction[1]:
            belt[ind] = current_instruction[2]
            if current_instruction[3] == "R":
                ind += 1
            else:
                ind -= 1
            if ind == len(belt):
                ind = 0
            state = current_instruction[4]
        else:
            k += 1
            j -= 1
        j += 1
    plist.append(' '.join(belt))
for each in plist:
    print(each)