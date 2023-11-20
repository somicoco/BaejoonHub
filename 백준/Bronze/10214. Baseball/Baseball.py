t = int(input())
n = 9
for _ in range(t):
    Yonsei = []
    Korea = []

    for _ in range(n):
        a, b = input().split()
        Yonsei.append(int(a))
        Korea.append(int(b))

    result = "Yonsei" if sum(Yonsei) > sum(Korea) else "Korea"
    print(result)