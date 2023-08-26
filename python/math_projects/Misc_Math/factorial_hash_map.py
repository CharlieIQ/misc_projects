# Don't know why this would ever be useful ngl 😂

# This uses recursion
def factorial(n):
  if n == 0:
    return 1
  else:
    return n * factorial(n - 1)

factorial_nums = {}

for i in range(0, 10):
  fact = factorial(i)
  factorial_nums[i] = fact


print(factorial_nums)