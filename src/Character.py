import pygame
from SoundPlayer import SoundPlayer

class Character(pygame.sprite.Sprite):
    def __init__(self):
        super().__init__() # call the super constructor for the pygame sprite class
        self.soundPlayer = SoundPlayer()
