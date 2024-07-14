import re


def solution(files):
    ans = map(lambda x: re.match("^([a-zA-Z\\-\\s]+)(\\d{1,5})(.*)$", x), files)
    ans = map(lambda m: [m.group(0), m.group(1).lower(), int(m.group(2))], ans)
    ans = sorted(ans, key=lambda x: (x[1], x[2]))
    ans = map(lambda x: x[0], ans)
    ans = list(ans)
    return ans
