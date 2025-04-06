package 입문;

import java.util.stream.IntStream;

public class k의개수 {
    // 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13
    // 이렇게 총 6번 등장합니다.
    // 정수 i, j, k가 매개변수로 주어질 때,
    // i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.

    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            if (String.valueOf(l).contains(String.valueOf(k))){
                String[] strArr = String.valueOf(l).split("");
                for (String str : strArr){
                    answer += str.equals(String.valueOf(k)) ? 1 : 0;
                }
            }
        }
        return answer;
    }

    public int solution2(int i, int j, int k) {
        int answer = 0;

        for (int n = i; n <= j; n++) {
            int temp = n;
            while (temp > 0) {
                if (temp % 10 == k) {
                    answer++;
                }
                temp /= 10;
            }
        }

        return answer;
    }

    public int solution3(int i, int j, int k) {
        StringBuilder sb = new StringBuilder();

        for (int l = i; l <= j; l++) {
            sb.append(l);
        }

        String total = sb.toString();
        return total.length() - total.replace(String.valueOf(k), "").length();
    }

    public int solution4(int i, int j, int k) {

        return (int) IntStream.rangeClosed(i, j)
                .mapToObj(String::valueOf)
                .flatMapToInt(String::chars)
                .map(c -> c - '0')
                .filter(n -> n == k)
                .count();
    }
}
