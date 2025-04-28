package 기초;

import java.util.Arrays;

public class x사이의개수 {
    // 문자열 myString이 주어집니다.
    // myString을 문자 "x"를 기준으로 나눴을 때
    // 나눠진 문자열 각각의 길이를 순서대로
    // 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

    public int[] solution(String myString) {
        String[] strArr = myString.trim().split("x",-1);
        System.out.println(Arrays.toString(strArr));
        int[] answer = new int[strArr.length];
        int inx =0;
        for (String str : strArr){
            answer[inx++] = str.length();
        }
        return answer;
    }

    public int[] solution2(String myString) {
        return Arrays.stream(myString.split("x", -1))   // 끝 빈 토큰 보존
                .mapToInt(String::length)          // 각 조각 길이
                .toArray();                        // int[] 반환
    }

    public int[] solution3(String myString) {
        int[] tmp = new int[myString.length() + 1]; // 최대 구간 수 = 문자 수 + 1
        int idx = 0, count = 0;

        for (char ch : myString.toCharArray()) {
            if (ch == 'x') {          // 구분자 만남 → 이전 구간 길이 저장
                tmp[idx++] = count;
                count = 0;
            } else {
                ++count;              // 구간 길이 누적
            }
        }
        tmp[idx++] = count;           // 마지막 구간 추가

        return Arrays.copyOf(tmp, idx); // 실제 길이만큼 잘라 반환
    }


}
