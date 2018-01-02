import pygame
from StateHandler import StateHandler
#from GameState import GameState

class Battle:
    def __init__(self, mapName):
        self.mapName = mapName

    def update(self):
        keys = pygame.key.get_pressed()        
