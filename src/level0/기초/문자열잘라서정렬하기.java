package level0.기초;

import java.util.Arrays;

public class 문자열잘라서정렬하기 {
    // 문자열 myString이 주어집니다.
    // "x"를 기준으로 해당 문자열을 잘라내
    // 배열을 만든 후 사전순으로 정렬한
    // 배열을 return 하는 solution 함수를 완성해 주세요.
    //단, 빈 문자열은 반환할 배열에 넣지 않습니다.

    public String[] solution(String myString) {
        String[] answer = myString.replaceAll("x+"," ").trim().split(" ");
        Arrays.sort(answer);

        return answer;
    }

    public String[] solution2(String myString) {
        return Arrays.stream(myString.split("x+"))   // 연속된 x를 한 덩어리로 구분
                .filter(s -> !s.isEmpty())      // 빈 토큰 제거
                .sorted()                       // 오름차순 정렬
                .toArray(String[]::new);
    }


}
