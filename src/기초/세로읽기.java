package 기초;

public class 세로읽기 {
    // 문자열 my_string과 두 정수 m, c가 주어집니다.
    // my_string을 한 줄에 m 글자씩 가로로 적었을 때
    // 왼쪽부터 세로로 c번째 열에 적힌 글자들을
    // 문자열로 return 하는 solution 함수를 작성해 주세요.
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_string.length(); i+=m) {
            answer.append(my_string.substring(i,i+m).charAt(c-1));
        }

        return answer.toString();
    }
    public String solution2(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();

        for (int i = c - 1; i < my_string.length(); i += m) {
            answer.append(my_string.charAt(i));
        }

        return answer.toString();
    }
}
