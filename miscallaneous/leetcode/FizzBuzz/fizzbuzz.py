# Arguably the easiest LeetCode Question - Will try in java with switch for fun
class Solution:
    def fizzBuzz(self, n: int) -> List[str]:
        fizz_buzz = []

        for i in range(1, n + 1):
            if (i % 5 == 0 and i % 3 == 0):
                fizz_buzz.append("FizzBuzz")
            elif (i % 3 == 0):
                fizz_buzz.append("Fizz")
            elif (i % 5 == 0):
                fizz_buzz.append("Buzz")
            else:
                fizz_buzz.append(str(i))
        
        return fizz_buzz