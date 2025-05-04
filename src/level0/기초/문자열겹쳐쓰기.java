package level0.기초;

public class 문자열겹쳐쓰기 {
    // 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
    // 문자열 my_string의 인덱스 s부터 overwrite_string의
    // 길이만큼을 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요.

    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) + overwrite_string + my_string.substring(overwrite_string.length()+s);
        return answer;
    }

    public String solution2(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        sb.replace(s, s + overwrite_string.length(), overwrite_string);
        return sb.toString();
    }

    public String solution3(String my_string, String overwrite_string, int s) {
        char[] result = my_string.toCharArray();
        for (int i = 0; i < overwrite_string.length(); i++) {
            result[s + i] = overwrite_string.charAt(i);
        }
        return new String(result);
    }
}
