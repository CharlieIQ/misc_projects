import pygame
import random as r
COLORS = [(0, 0, 255),(0, 255, 0),(255, 0, 0),(255, 255, 0),(255,0,255),(0,255,255)]

class Enemy:
    def __init__(self, id, screen_x, screen_y):
        self.id = id
        self.x = r.randint(0, screen_x)
        self.y = r.randint(0, screen_y)
        self.size = r.randint(10, 40)
        self.color = r.choice(COLORS)
        self.screen_x = screen_x
        self.screen_y = screen_y
        self.move_speed = r.randint(5, 10)
        self.xstep = self.move_speed
        self.ystep = self.move_speed

    def draw(self, screen):
        pygame.draw.circle(screen, self.color, (self.x, self.y), self.size)

    def move(self):
        # Create a step variable
        if self.x <= 0:
            self.xstep = self.move_speed
        elif self.x >= self.screen_x:
            self.xstep = -self.move_speed
        elif self.y <= 0 :
            self.ystep = self.move_speed
        elif self.y >= self.screen_y:
            self.ystep = -self.move_speed
    
        self.x += self.xstep

        self.y += self.ystep
    
    def get_current_position(self):
        return (self.x, self.y)
        