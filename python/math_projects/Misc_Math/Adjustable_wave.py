import math as m
import numpy as np
import matplotlib.pyplot as plot
pi = 3.141592653589793238462643383279502884197169

# Transformations where y = a(sin(bx))
a = 1
b = 1
c = (2*pi)/3
d = 5

period = (2*pi)/b
cycle = 2 * period
# Sine wave
def sine_wave():
    # Get x values of the sine wave
    x = np.arange(0, cycle, 0.1)
    y = np.sin(x)
    # Plot a sine wave
    plot.plot(((1 / b) * x) + (-c), a * (y + d))
    # Give a title for the sine wave plot
    plot.title(f'Sine wave')
    # Give x-axis label for the sine wave plot
    plot.xlabel('x')
    # Give y-axis label for the sine wave plot
    plot.ylabel('y')
    plot.grid(True, which='both')
    plot.axhline(y=0, color='k')
    plot.show()
    # Display the sine wave


sine_wave()

