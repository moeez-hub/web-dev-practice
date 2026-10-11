num = int(input("Enter Number"))
if num <= 1:
    print("Not prime")
else:
    i=2
    while i < num:
        if num % i == 0:
            print("Not Prime")
            break
        i=i+1
    else:
        print("Prime")        
