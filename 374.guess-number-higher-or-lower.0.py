#
# @lc app=leetcode id=374 lang=python
#
# [374] Guess Number Higher or Lower
#
# The guess API is already defined for you.
# @param num, your guess
# @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
# def guess(num):

class Solution(object):
    def guessNumber(self, n):
        """
        :type n: int
        :rtype: int
        """
        if guess(1) == 0:
            return 1
        if guess(n) == 0:
            return n
        left, right = 1, n
        guessValue = (left + right)  / 2
        value = guess(guessValue)
        while value != 0:
            if value == 1:
                left = guessValue
            if value == -1:
                right = guessValue
            guessValue = (left + right)  / 2
            value = guess(guessValue)
        return guessValue
