from pygame import mixer

class SoundPlayer:
    def __init__(self):
        mixer.init() # initialize the mixer library

    def play(self, sound):
        sound = mixer.Sound("../res/audio/" + sound)
        sound.play()
        
        
