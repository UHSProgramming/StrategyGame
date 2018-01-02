import pygame
from Character import Character

"""
CharacterHandler
Controls all of the characters in the current gamestate
Can be passed around to maintain character state
"""

class CharacterHandler:
    def __init__(self):
        self.characters = []

    def addState(self, newCharacter):
        self.characters.append(newCharacter)

    def getCharacters(self):
        return self.characters
