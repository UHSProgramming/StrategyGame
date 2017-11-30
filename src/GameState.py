import pygame
from abc import ABCmeta, abstractmethod

"""
GameState
This is the abstract class to be derived from for the various gamestates.
Gamestates are used to manage how the game is run
"""

class GameState:
    __metaclass__ = ABCMeta

    @abstractmethod
    # update is called once per frame for each gamestate
    def update(self): pass
