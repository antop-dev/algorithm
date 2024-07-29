def solution(land):
    ans = 0
    for i in range(1, len(land)):
        prev = land[i - 1]
        curr = land[i]
        curr[0] += max(prev[1], prev[2], prev[3])
        curr[1] += max(prev[0], prev[2], prev[3])
        curr[2] += max(prev[0], prev[1], prev[3])
        curr[3] += max(prev[0], prev[1], prev[2])
        ans = max(curr)
    return ans
