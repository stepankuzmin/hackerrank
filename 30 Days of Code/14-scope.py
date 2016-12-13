# https://www.hackerrank.com/challenges/30-scope

class Difference:
    def __init__(self, a):
        self.__elements = a

    def computeDifference(self):
        self.maximumDifference = max(self.__elements) - min(self.__elements)
