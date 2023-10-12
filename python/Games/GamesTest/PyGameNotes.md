# PyGame Learning Notes

## Setting Up a Game
### Import Statement
First we need to import pygame
`import pygame`

### Color Variables
An important thing in any game is color of course. Colors use RGB, meaning you can create and store them in variables. For example, black is equal 10 (0, 0, 0) and white is equal to (255, 255, 255)

### Initializing a Game
#### Initializing
To start a game, you need to use init():

`pygame.init()` Will start the game
#### Screen Setup
The game needs a window to run in, and this window requires setup. To set up the screen, you can declare a variable for size or just put 2 pixel values in the `display.setmode()` function. The screen variable will be calles when adjustments to the screen are made.

Ex. For a 1000px by 1000px game:\
`screen = pygame.display.setmode(1000, 1000)`

To set a caption for the window, use the `set_caption()` method:\
`pygame.display.set_caption("Game Name")`

#### Done Flag
A useful way to keep a game running is setting up a flag variable for when the user hits the close button. 

#### Game Clock 
To manage how fast the screen updates, the game needs a clock to run. To initialize a clock object:\
`clock = pygame.time.Clock()`

To limit to 60fps for example in the game:\
`clock.tick(60)`

### Main Game Loop & Structure
```py
# Main Program Loop 
while not done:
    # Main event loop
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True
 
    # Game logic should go here
 
    # Screen-clearing code goes here
    screen.fill(WHITE)
 
    # Drawing code should go here
 
    # Update the screen
    pygame.display.flip()
 
    # Limit to 60 frames per second
    clock.tick(60)
 
# Close the window and quit
pygame.quit()
```

While the flag variable done is false, then the game will continue to run.

This block of code will check if the game is quit. If the event is `pygame.QUIT`, the loop will terminate.
```py
for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True
```

## Creating & Drawing Shapes
The `.draw` method in pygame is used to create objects in the window. The `.flip()` method **MUST** be called after objects are drawn in. 

### Lines
To draw lines, the `pygame.draw.line()` method is used. The parameters are:\
`pygame.draw.line(screen, color, [xPos1, yPos1], [xPos2, yPos2], line_width)`

### Rectangles
To draw rectangles, the `pygame.draw.rect()` method is used. The parameters are:\
`pygame.draw.rect(screen, color, [xPos, yPos, width, height], border_width)`

### Ellipse
To draw ellipses, the `pygame.draw.ellipse()` method is used. Rectangles are used in the parameter to indicate the position and dimensions of the ellipse. The created ellipse will be bounded by the rectangle. The parameters are:\
`pygame.draw.ellipse(screen, color, *rect*, border_width)`

### Arc Lengths
To draw arcs, the `pygame.draw.arc()` method is used. Rectangles are again used to indicate the position and dimensions the ellipse which the arc will be based on. The start angle and stop angle are measured in **radians**.

The parameters are:\
`pygame.draw.arc(screen, color, rect, start_angle, stop_angle, width)`

### Polygons
To draw polygons, the `pygame.draw.polygon()` method is used. A tuple of 3 or more points for the vertices of the polygon. The parameters are:\
`pygame.draw.polygon(screen, color, [[point1x, point1y], [point2x, point2y], [point3x, point3y]], width)`

### Text
#### Selecting font
To select font, use the font.SysFont method. For example, calibri font:\

`font = pygame.font.SysFont('Calibri', font_size, is_bold, is_italic)`

To place the text on screen, use the `render()` method. The `True` parameter means that anti-aliased text. The parameters are:\
`text = font.render("Text to display", *True*, color)`


