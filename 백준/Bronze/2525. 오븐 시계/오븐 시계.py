h, m = input().split()
cookM = input()
h = int(h)
m = int(m)
cookM = int(cookM)

total_minutes = m + cookM
total_hours = h + total_minutes // 60
minutes_left = total_minutes % 60

if total_hours >= 24:
    total_hours -= 24

print(total_hours, minutes_left)
