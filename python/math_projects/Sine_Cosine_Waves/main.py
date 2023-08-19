"""
Sine and Cosine waves
Chipmunk man WILDING right now
"""

import numpy as np
import matplotlib.pyplot as plot
pi = 3.141592653589793238462643383279502884197169

def sine_wave():
    # Get x values of the sine wave
    x = np.arange(-2*pi, 4*pi, 0.1)
    y = np.sin(x)
    # Plot a sine wave
    plot.plot(x, y)
    # Give a title for the sine wave plot
    plot.title('Sine wave')
    # Give x-axis label for the sine wave plot
    plot.xlabel('x')
    # Give y-axis label for the sine wave plot
    plot.ylabel('y')
    plot.grid(True, which='both')
    plot.axhline(y=0, color='k')
    plot.show()
    # Display the sine wave

def cosine_wave():
    # Get x values of the cosine wave
    x = np.arange(-2*pi, 4*pi, 0.1)
    y = np.cos(x)
    # Plot a cosine wave
    plot.plot(x, y)
    # Give a title for the cosine wave plot
    plot.title('Cosine wave')
    # Give x-axis label for the cosine wave plot
    plot.xlabel('x')
    # Give y-axis label for the cosine wave plot
    plot.ylabel('y')
    plot.grid(True, which='both')
    plot.axhline(y=0, color='k')
    plot.show()
    # Display the cosine wave


sine_wave()
cosine_wave()
