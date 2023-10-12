import pygame
class Player:
    def __init__(self, xPos, yPos):
        self.xPos = xPos
        self.yPos = yPos
        self.color = (0, 0, 255)
        self.isJumping = False

    def draw(self, screen):
        pygame.draw.circle(screen, self.color, (self.xPos, self.yPos), 25)

    def jump(self):
        jumpCount = 10
        if jumpCount >= -10:
            self.isJump = True
            neg = 1
            if jumpCount < 0:
                neg = -1
            self.yPos -= (jumpCount ** 2) * 0.3 * neg
            jumpCount -= 1

            # self.yPos += (jumpCount ** 2) * 0.1 * neg

        else:
            self.isJump = False
            jumpCount = 10

    def move(self, xStep, yStep):
        self.xPos += xStep
        self.yPos += yStep