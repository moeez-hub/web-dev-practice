num = int(input("Enter number"))
if num <= 0:
    print("Does not exist")
else:
    factorial = 1
    for i in range(1, num+1):
        factorial = factorial*i
    print(factorial)        