package kr.co.programmers;

// https://github.com/antop-dev/algorithm/issues/434
public class P135807 {
    public int solution(int[] arrayA, int[] arrayB) {
        int a = check(arrayA, arrayB);
        int b = check(arrayB, arrayA);
        return Math.max(a, b);
    }

    // 조건에 맞는 수 구하기
    private int check(int[] x, int[] y) {
        int gcd = gcd(x);
        for (int n = gcd; n > 1; n--) {
            if (canDivide(x, n) && canNotDivide(y, n)) {
                return n;
            }
        }
        return 0;
    }

    // 모든 수를 n으로 나눌 수 있는가?
    private boolean canDivide(int[] nums, int n) {
        for (int num : nums) {
            if (num % n != 0) {
                return false;
            }
        }
        return true;
    }

    // 모든 수를 n으로 나눌 수 없는가?
    private boolean canNotDivide(int[] nums, int n) {
        for (int num : nums) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    }

    // 배열들의 최대 공약수 구하기
    private int gcd(int[] nums) {
        int v = nums[0];
        for (int i = 1; i < nums.length; i++) {
            v = gcd(v, nums[i]);
        }
        return v;
    }

    // 두 수의 최대 공약수 구하기 (유클리드 알고리즘)
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

}
