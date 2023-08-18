for i in range(0, 100):
    num = i

    flag = False

    if num == 1:
        print(num, "is not a prime number")
    elif num > 1:
        for n in range(2, num):
            if (num % n) == 0:
                flag = True
                break

        if flag:
            pass
        else:
            print(num, "is a prime number")
