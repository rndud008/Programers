package 기초;

public class 문자열뒤집기 {
    // 문자열 my_string과 정수 s, e가 매개변수로 주어질 때,
    // my_string에서 인덱스 s부터 인덱스 e까지를
    // 뒤집은 문자열을 return 하는 solution 함수를 작성해 주세요.

    public String solution(String my_string, int s, int e) {
        StringBuilder builder = new StringBuilder(my_string.substring(s,e+1)).reverse();
        String answer = my_string.substring(0,s) + builder + my_string.substring(e+1);

        return answer;
    }
}
