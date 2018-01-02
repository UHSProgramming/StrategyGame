import pygame

"""
StateHandler
Handles all the given GameStates.
StateHandler handles swapping states and maintaining state
"""

class StateHandler:
    def __init__(self):
        self.states = []
        self.stateIndex = 0

    def addState(self, newState): # add a state to the list of states
        self.states.append(newState)

    def changeState(self, newState): # change current state to states[newState]
        self.currentState = self.states[newState]
        self.stateIndex = newState

    def getCurrentState(self): # get the current state
        return self.states[self.stateIndex]

    def update(self):
        self.getCurrentState().update()
