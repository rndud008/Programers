package 기초;

public class 문자열이몇번등장하는지세기 {
    // 문자열 myString과 pat이 주어집니다.
    // myString에서 pat이 등장하는
    // 횟수를 return 하는 solution 함수를 완성해 주세요.

    public int solution(String myString, String pat) {
        int answer = 0;

        for (int i = 0; i < myString.length() - pat.length() +1; i++) {
            if (pat.equals(myString.substring(i,i+pat.length()))){
                answer++;
            }
        }
        return answer;
    }
}
