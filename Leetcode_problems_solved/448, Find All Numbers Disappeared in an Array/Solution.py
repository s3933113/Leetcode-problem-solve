class Solution:
    def findDisappearedNumbers(self, nums: list[int]) -> list[int]:
        counts = {}
        answer = []
        for num in nums:
            counts[num] = counts.get(num, 0) + 1
        for i in range(1, len(nums) + 1):
            if i not in counts:
                answer.append(i)
        return answer

if __name__ == '__main__':
    nums = [4,3,2,7,8,2,3,1]
    print(Solution().findDisappearedNumbers(nums))