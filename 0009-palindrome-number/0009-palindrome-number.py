class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False

        original_x = x
        reversed_x = 0

        while x > 0:
            last_digit = x % 10
            reversed_x = (reversed_x * 10) + last_digit
            x //= 10

        return original_x == reversed_x   