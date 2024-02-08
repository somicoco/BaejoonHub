n, x = map(int, input().split())
num = input()
numbers = num.split()
numbers = [int(number) for number in numbers if int(number) < x]

for number in numbers:
    print(number)