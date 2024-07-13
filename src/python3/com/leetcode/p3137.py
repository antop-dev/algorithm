import collections


class Solution:
    def minimumOperationsToMakeKPeriodic(self, word: str, k: int) -> int:
        length = len(word)
        counter = collections.defaultdict(lambda: 0)
        max_count = 0
        for i in range(0, length, k):
            substring = word[i:i + k]
            count = counter[substring] + 1
            max_count = max(max_count, count)
            counter[substring] = count

        total = length // k
        return total - max_count
