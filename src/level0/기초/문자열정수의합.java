package level0.기초;

public class 문자열정수의합 {
    // 한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
    public int solution(String num_str) {
        int answer = 0;
        for (Character c : num_str.toCharArray()){
            answer += Integer.parseInt(Character.toString(c));
        }

        return answer;
    }

    public int solution2(String num_str) {
        return num_str.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(Integer::parseInt)
                .mapToInt(i -> i)
                .sum();
    }

    public int solution3(String num_str) {
        return num_str.chars()
                .map(c -> c - '0') // 아예 아스키 계산으로
                .sum();
    }
}
