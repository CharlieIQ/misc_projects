class Solution(object):
    def mySqrt(self, x):
        """
        :type x: int
        :rtype: int
        """
        for num in range(0, int(x/2)+1):
            print(num)
            if num * num == x:
                return num
            elif (num/2 < x) & (num/4 > x): # Still does nothing
                return int(num)
            

# square_root1 = Solution().mySqrt(9)
square_root2 = Solution().mySqrt(8)

# print(square_root1)
print(square_root2)