year = int(input())
result = False

if year % 4 == 0:
    if year % 100 != 0 or year % 400 == 0:
        result = True
else:
    result = False

if result:
    print(1)
else:
    print(0)
