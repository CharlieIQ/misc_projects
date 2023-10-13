import pygame
import random as r

class Enemy:
    def __init__(self, id, screen_x, screen_y):
        self.id = id
        self.x = r.randint(0, screen_x)
        self.y = r.randint(0, screen_y)
        self.size = r.randint(5, 50)
        self.color = (255, 0, 0)
        self.screen_x = screen_x
        self.screen_y = screen_x

    def draw(self, screen):
        pygame.draw.circle(screen, self.color, (self.x, self.y), self.size)

    def move(self):
        # Create 2 rng numbers
        rng = r.randint(0, 3)
        steprng = r.randint(0, 2)
        # Create a step variable
        step = 10
        if steprng == 1:
            step*=-1

        if self.x <= 0 and step < 0:
            step*=-1
        elif self.x > self.screen_y and step < 0:
            step*=-1
        elif self.y <= 0 and step < 0:
            step*=-1
        elif self.y > self.screen_y and step < 0:
            step*=-1
        
        if rng == 0:
            self.x += step
        elif rng == 1:
            self.y += step
        else:
            self.x += step
            self.y += step
        