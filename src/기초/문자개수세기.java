package 기초;

public class 문자개수세기 {
    // 알파벳 대소문자로만 이루어진 문자열 my_string이 주어질 때,
    // my_string에서 'A'의 개수,
    // my_string에서 'B'의 개수,...,
    // my_string에서 'Z'의 개수,
    // my_string에서 'a'의 개수,
    // my_string에서 'b'의 개수,...,
    // my_string에서 'z'의 개수를
    // 순서대로 담은 길이 52의 정수 배열을 return 하는 solution 함수를 작성해 주세요.

    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char c : my_string.toCharArray()){
            int val = 0;
            if(Character.isLowerCase(c)){
                val = (int) c - 97 + 25 +1;
            }else {
                val = (int) c - 65;
            }
            answer[val]++;

        }
        return answer;
    }

    public int[] solution2(String my_string) {
        int[] answer = new int[52];
        for (char c : my_string.toCharArray()){
            if (Character.isUpperCase(c)) {
                answer[c - 'A']++;
            } else if (Character.isLowerCase(c)) {
                answer[c - 'a' + 26]++;
            }

        }
        return answer;
    }
}
