import pygame
class Player:
    def __init__(self, x, y):
        self.x = x
        self.y = y
        self.color = (255, 255, 255)
        self.size = 25
    

    def draw(self, screen):
        pygame.draw.circle(screen, self.color, (self.x, self.y), self.size)
    
    
    def move(self, keys):
        if keys[pygame.K_LEFT]:
            self.x -= 10
        if keys[pygame.K_RIGHT]:
            self.x += 10
        if keys[pygame.K_UP]:
            self.y -= 10
        if keys[pygame.K_DOWN]:
            self.y += 10