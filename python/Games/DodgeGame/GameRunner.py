import pygame
import Player
import Opponent

BLACK = (0, 0, 0)

pygame.init()

# Set the width and height of the screen to monitor size
infoObject = pygame.display.Info()
screen_x = infoObject.current_w
screen_y = infoObject.current_h
# Create Screen
screen = pygame.display.set_mode((screen_x, screen_y))
# Set title of game
pygame.display.set_caption("SizeIO")
# Create player object
player = Player.Player(screen_x/2, screen_y/2)
# Create list of opponents
list_of_opponents = []
list_of_opponents_pos = []
# Create enemies
for i in range(0, 200):
    opp = Opponent.Enemy(i, screen_x, screen_y)
    list_of_opponents.append(opp)
    list_of_opponents_pos.append((0, 0))
# Loop until the user clicks the close button.
done = False

# Used to manage how fast the screen updates
clock = pygame.time.Clock()


#  Main Program Loop
while not done:
    # Main event loop
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True

    # Game logic should go here

    # Screen-clearing code goes here
    keys = pygame.key.get_pressed()
    # Move the player
    player.move(keys)

    for i in range(0, len(list_of_opponents)):
        list_of_opponents[i].move()
        list_of_opponents_pos[i] = list_of_opponents[i].get_current_position()

    # If you want a background image, replace this clear with blit'ing the
    # background image.
    screen.fill(BLACK)

    # Drawing code should go here
    player.draw(screen)
    for i in range(0, len(list_of_opponents)):
        list_of_opponents[i].draw(screen)

    # Go ahead and update the screen with what we've drawn.
    pygame.display.flip()

    # Limit to 60 frames per second
    clock.tick(60)

# Close the window and quit.
pygame.quit()
