import math
#Does not account if width is 0
def evaluate(h, k, a, b, x, y):
    return (((x - h) ** 2) / a**2 + ((y - k) ** 2) / b ** 2)

plist = []
for xyz in range(int(input())):
    x1, y1, x2, y2, w, n = map(int, input().split())
    if w == 0:
        for j in range(n):
            point_x, point_y = map(float, input().split())
            if point_x == x1:
                plist.append(1)
            else:
                plist.append(0)
    else:
        foci_dist = math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)
        A = (w - foci_dist) / 2
        B = foci_dist + A
        C = (A + B) / 2
        height = math.sqrt(C ** 2 - (foci_dist / 2) ** 2)
        width = w / 2
        midpoint = (x1 + x2) / 2, (y2 + y1) / 2
        for j in range(n):
            point_x, point_y = map(float, input().split())
            if evaluate(midpoint[0], midpoint[1], width, height, point_x, point_y) <= 1:
                plist.append(1)
            else:
                plist.append(0)
for each in plist:
    print(each)