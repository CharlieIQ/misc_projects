# IDK why this breaks ngl
class Solution(object):
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        prefixes = []
        prefixes.append(strs[0][0])
        common_prefix = ""
        # Iterate over list
        for word in strs:

            # Iterate over each char in word in list
            for letter in word:
                if letter == prefixes[0]:
                    prefixes.append(letter)

            for letter in prefixes:
                if (prefixes[letter] == prefixes[letter + 1]) & letter + 1 < len(prefixes):
                    prefixes.remove(prefixes[letter + 1])

        return prefixes


test1 = Solution()
test2 = Solution()
print(test1.longestCommonPrefix(["flower", "flow", "flight"]))
print(test2.longestCommonPrefix(["dog", "racecar", "car"]))
