import pygame
import sys

from StateHandler import StateHandler
from SoundPlayer import SoundPlayer

pygame.init() # initialize pygame

winSize = (800, 600)
screen = pygame.display.set_mode(winSize)
pygame.display.set_caption("Strategy Game - UHS Programming")

running = True
clock = pygame.time.Clock()

# misc temporary variables
BACKGROUND_COLOR = (255, 0, 128)
testImage = pygame.image.load("../res/img/lyn.png")
sound = SoundPlayer().play("mountain_king.ogg")

while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT: # user quit?
            running = False

    screen.fill(BACKGROUND_COLOR) # draw the background

    screen.blit(testImage, (100,100))
    
    pygame.display.flip() # flip the double buffer
    clock.tick(60) # move the clock forward

pygame.quit() # quit pygame
        
