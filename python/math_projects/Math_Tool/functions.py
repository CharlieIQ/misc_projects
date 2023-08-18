import math

pi = 3.14159265359


def py_theorem():
    print('(a^2) + (b^2) = (c^2)')
    solve_for_pyth = input('What variable to solve for? ')
    if solve_for_pyth == 'a':
        c = float(input('Enter c value: '))
        b = float(input('Enter b value: '))
        a_squared = c ** 2 - b ** 2
        a = math.sqrt(a_squared)
        print(f"{solve_for_pyth} = {a}")

    elif solve_for_pyth == 'b':
        c = float(input('Enter c value: '))
        a = float(input('Enter a value: '))
        b_squared = c ** 2 - a ** 2
        b = math.sqrt(b_squared)
        print(f"{solve_for_pyth} = {b}")

    elif solve_for_pyth == 'c':
        a = float(input('Enter a value: '))
        b = float(input('Enter b value: '))
        c_squared = (a ** 2) + (b ** 2)
        c = math.sqrt(c_squared)
        print(f"{solve_for_pyth} = {c}")


square_list = ['area', 'perimeter']


def square_area():
    print('a = b*h')
    solve_for_square_area = input('What variable to solve for? ')
    if solve_for_square_area == 'a':
        b = float(input('Enter b value: '))
        h = float(input('Enter h value: '))
        a = b*h
        print(f'Area = {a}')
    elif solve_for_square_area == 'b':
        a = float(input('Enter a value: '))
        h = float(input('Enter h value: '))
        b = a / h
        print(f'Area = {b}')

    elif solve_for_square_area == 'h':
        a = float(input('Enter a value: '))
        b = float(input('Enter b value: '))
        h = a / b
        print(f'Area = {h}')
