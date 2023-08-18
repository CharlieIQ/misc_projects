# Cosine Law

import math as m
# c = ((a**2 + b**2) - ((2 * (a * b)) * cosC))^0.5
pi = m.pi

def Cosine_Law():
    a = float(input("Enter length a: "))
    b = float(input("Enter length b: "))
    C = m.radians(float(input("Enter angle C: ")))

    c = m.sqrt((a ** 2 + b ** 2) - ((2 * (a * b)) * (m.cos(C))))

    print(f"c = {c}")


Cosine_Law()
