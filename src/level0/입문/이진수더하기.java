package level0.입문;

public class 이진수더하기 {
    // 이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
    // 두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

    public String solution(String bin1, String bin2) {
        String answer = Integer.toBinaryString(Integer.parseInt(bin1,2) + Integer.parseInt(bin2,2));

        return answer;
    }

    public String solution2(String bin1, String bin2) {
        StringBuilder result = new StringBuilder();

        int i = bin1.length() - 1;
        int j = bin2.length() - 1;
        //i와 j는 각 2진수 문자열의 맨 끝 인덱스 (오른쪽부터 시작)
        //2진수 덧셈은 오른쪽(일의 자리)부터 해야함

        int carry = 0;
        // 덧셈할 때 생기는 **올림(캐리)**를 저장할 변수야.

        while (i >= 0 || j >= 0 || carry > 0) {
            // 덧셈을 계속할 조건이야.
            //i >= 0: bin1에 아직 안 더한 숫자가 남아 있음
            //j >= 0: bin2에 아직 안 더한 숫자가 남아 있음
            //carry > 0: 이전 연산에서 생긴 올림이 남아 있음

            int bit1 = (i >= 0) ? bin1.charAt(i--) - '0' : 0;
            // bin1의 현재 자리 숫자를 가져와 bit1에 저장해.
            // charAt(i)는 문자니까 '0'을 빼서 정수로 변환해 ('1' - '0' = 1)
            // 만약 i가 음수(더 이상 없음)라면 0으로 취급해.
            // 그리고 i--로 인덱스를 줄여서 다음 자리로 넘어가.
            // 예시: bin1 = "1011"이라면, 맨 오른쪽부터 1, 1, 0, 1 순서로 읽어옴.

            int bit2 = (j >= 0) ? bin2.charAt(j--) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            result.append(sum % 2);     // 현재 자리 비트
            carry = sum / 2;            // 다음 자리로 넘길 캐리
        }

        return result.reverse().toString();
    }

}
