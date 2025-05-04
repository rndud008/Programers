package level0.기초;

import java.math.BigInteger;

public class 두수의합 {
    // 0 이상의 두 정수가 문자열 a, b로 주어질 때,
    // a + b의 값을 문자열로 return 하는 solution 함수를 작성해 주세요.

    public String solution(String a, String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        String answer = bigA.add(bigB).toString();
        return answer;
    }

    public String solution2(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = digitA + digitB + carry;
            result.append(sum % 10);
            carry = sum / 10;

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
