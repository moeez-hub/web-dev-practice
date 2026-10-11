print("odd numbers between 1 and 100")
counter = 0
for num in range (1, 100):
    if num %2 != 0:
        print(num)
        counter = counter+1
print("Counter = ",counter)        