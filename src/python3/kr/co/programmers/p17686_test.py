import unittest

import p17686


class Test(unittest.TestCase):

    def test_1(self):
        files = ["img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"]
        ans = ["img1.png", "IMG01.GIF", "img02.png", "img2.JPG", "img10.png", "img12.png"]
        self.assertEqual(p17686.solution(files), ans)

    def test_2(self):
        files = ["F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"]
        ans = ["A-10 Thunderbolt II", "B-50 Superfortress", "F-5 Freedom Fighter", "F-14 Tomcat"]
        self.assertEqual(p17686.solution(files), ans)
