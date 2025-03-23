package 입문;

public class 인덱스바꾸기 {
    // 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때,
    // my_string에서 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

    public String solution(String my_string, int num1, int num2) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            if (i == num1){
                answer.append(my_string.charAt(num2));
            }else if(i == num2){
                answer.append(my_string.charAt(num1));
            }else {
                answer.append(my_string.charAt(i));
            }

        }
        return answer.toString();
    }

    public String solution2(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();

        // Swap
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;

        return new String(arr);
    }

    public String solution3(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder(my_string);

        char ch1 = sb.charAt(num1);
        char ch2 = sb.charAt(num2);

        sb.setCharAt(num1, ch2);
        sb.setCharAt(num2, ch1);

        return sb.toString();
    }
}
