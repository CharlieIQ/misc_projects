import math as m

def speed_in_motion():
    # Speed in motion
    vi = float(input('Enter initial velocity (in meters/sec): '))
    t = float(input('Enter time (in seconds): '))
    a = float(input('Enter const. acceleration (in m/s2): '))
    v = vi + (a*t)
    print(f'After {t} seconds the object will be traveling at {v}m/s')


def displacement_over_time():
    v1 = float(input('Enter initial velocity (in meters/sec): '))
    v2 = float(input('Enter second velocity (in meters/sec): '))
    t = float(input('Enter time (in seconds): '))
    displacement = (((v1 + v2)/2) * t)
    print(f'After {t} seconds the object will have travelled {displacement} meters')

def vertical_motion():
    vi = float(input('Enter initial velocity (in meters/sec): '))
    delta_y = float(input('Enter vertical distance (in meters): '))
    a = float(input('Enter const. acceleration (in m/s2): '))
    # In testing!!!
    root_quadratic = (vi ** 2) - ((4 * (0.5 * a)) * (-1 * delta_y))
    sqrt_quadratic = m.sqrt(root_quadratic)
    t_one = ((-vi) + sqrt_quadratic) / (2 * (0.5 * a))
    t_two = ((-vi) - sqrt_quadratic) / (2 * (0.5 * a))
    print(f't = {t_one} and {t_two}')

