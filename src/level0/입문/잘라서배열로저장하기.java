package level0.입문;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class 잘라서배열로저장하기 {
    // 문자열 my_str과 n이 매개변수로 주어질 때,
    // my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.

    public String[] solution(String my_str, int n) {
        int length  = (int)Math.ceil((double) my_str.length()/n);
        String[] answer = new String[length];
        int start = 0;
        for (int i = 0; i < length; i++) {
            if (n+start < my_str.length()){
                answer[i] = my_str.substring(start,n+start);
            }else {
                answer[i] = my_str.substring(start,my_str.length());
            }

            start += n;
        }
        return answer;
    }

    public String[] solution2(String my_str, int n) {
        int length = (my_str.length() + n - 1) / n; // 올림 처리
        String[] answer = new String[length];

        for (int i = 0; i < length; i++) {
            int start = i * n;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }

    public String[] solution3(String my_str, int n) {
        int length = (my_str.length() + n - 1) / n;
        return IntStream.range(0, length)
                .mapToObj(i -> {
                    int start = i * n;
                    int end = Math.min(start + n, my_str.length());
                    return my_str.substring(start, end);
                })
                .toArray(String[]::new);
    }

    public String[] solution4(String my_str, int n) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < my_str.length(); i += n) {
            int end = Math.min(i + n, my_str.length());
            list.add(my_str.substring(i, end));
        }
        return list.toArray(new String[0]);
    }
}
