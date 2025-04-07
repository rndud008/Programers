package 입문;

import java.util.Arrays;

public class 다음에올숫자 {
    // 등차수열 혹은 등비수열 common이
    // 매개변수로 주어질 때,
    // 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

    public int solution(int[] common) {
        int answer = 0;
        int[] check = new int[common.length];
        for (int i = 1; i < common.length; i++) {
            check[i-1] = common[i] - common[i-1]  ;
        }

        return check[0] == check[1] ? common[common.length-1] + check[0] : common[common.length-1] * (check[1]/check[0]) ;
    }

    public int solution2(int[] common) {
        int d1 = common[1] - common[0];
        int d2 = common[2] - common[1];

        // 등차수열일 경우
        if (d1 == d2) {
            return common[common.length - 1] + d1;
        } else {
            // 등비수열일 경우
            int r = common[1] / common[0];
            return common[common.length - 1] * r;
        }
    }

    public int solution3(int[] common) {
        boolean isArithmetic = (common[1] - common[0]) == (common[2] - common[1]);
        return isArithmetic
                ? common[common.length - 1] + (common[1] - common[0])
                : common[common.length - 1] * (common[1] / common[0]);
    }
}
