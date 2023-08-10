# This was a leetcode problem I did
class Solution():
    # (My solution is so good omg)
    def twoSum(self, nums, target):
        nums_and_index = {}
        
        for count, num in enumerate(nums):
            diff = target - num
            if diff in nums_and_index:
                return [nums_and_index[diff], count]
            nums_and_index[num] = count


test = Solution()
print(test.twoSum([2, 7, 9, 11, 15], 9))
print(test.twoSum([3, 3], 6))
print(test.twoSum([3, 2, 4], 7))