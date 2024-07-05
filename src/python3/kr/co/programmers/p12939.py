import sys


def solution(s):
    _min = sys.maxsize
    _max = -sys.maxsize - 1

    v = 0
    digit = 1
    for i in reversed(range(len(s))):
        ch = s[i]

        if ch != ' ':
            if ch == '-':
                v = v * -1
            else:
                v = v + (ord(ch) - ord('0')) * digit
                digit = digit * 10

        if ch == ' ' or i == 0:
            _min = min(_min, v)
            _max = max(_max, v)
            v = 0
            digit = 1

    return f"{_min} {_max}"
