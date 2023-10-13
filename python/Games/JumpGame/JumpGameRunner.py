import pygame
import Player
import Level
 
BLACK = (0, 0, 0)
WHITE = (255, 255, 255)
GREEN = (0, 255, 0)
RED = (255, 0, 0)
BLUE = (0, 0, 255)
background_default = (178, 235, 242)
# Initialize game
pygame.init()
# Set the width and height of the screen [width, height]
size = (1000, 650)
screen = pygame.display.set_mode(size)
 
pygame.display.set_caption("Jump Game")
 
# Loop until the user clicks the close button.
done = False

dt = 0
# Create player object
player = Player.Player(500, 500)

# Used to manage how fast the screen updates
clock = pygame.time.Clock()
 
# Main Program Loop 
while not done:
    # Main event loop
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True
 
    # Game logic should go here
 
    # Screen-clearing code goes here
 
    # Set Screen to Cyan Sky
    screen.fill(background_default)
 
    # Drawing code should go here
    # Generate Level
    Level.generateLevel(screen)

    # Draw the player
    player.draw(screen)
    # Get list of keys
    keys = pygame.key.get_pressed()

    if keys[pygame.K_SPACE]:
        player.jump()
    
    
    # Update the screen 
    pygame.display.flip()
 
    # Limit to 60fps
    dt = clock.tick(60)
 
# Close the window and quit.
pygame.quit()