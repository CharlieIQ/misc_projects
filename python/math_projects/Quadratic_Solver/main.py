# Made by Charlie of Massive Hog LLC
import math as m

def quadratic_intercepts():
    # Using Standard form ax^2 + bx + c
    a = float(input('Enter a value: '))
    b = float(input('Enter b value: '))
    c = float(input('Enter c value: '))
    # Calculates discriminant
    discriminant = (b ** 2) - (4 * a * c)
    # If the discriminant is less than 0, it gives an error
    if discriminant <= 0:
        print('='*50)
        print('Error - Discriminant less than 0, no roots!')
        print('=' * 50)
        # Gets the square root using the math library
    sqrt_discriminant = m.sqrt(discriminant)
    # First root
    x_one = ((-b) + sqrt_discriminant) / (2 * a)
    # Second root
    x_two = ((-b) - sqrt_discriminant) / (2 * a)
    print('=' * 50)
    print(f'x-intercepts = {x_one} and {x_two}')
    print('=' * 50)


while True:
    quadratic_intercepts()
