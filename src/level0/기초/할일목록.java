package level0.기초;

import java.util.stream.IntStream;

public class 할일목록 {
    // 오늘 해야 할 일이 담긴 문자열 배열 todo_list와
    // 각각의 일을 지금 마쳤는지를 나타내는 boolean 배열
    // finished가 매개변수로 주어질 때,
    // todo_list에서 아직 마치지 못한 일들을
    // 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.

    public String[] solution(String[] todo_list, boolean[] finished) {
        int len = 0;
        for (boolean bool : finished){
            if (!bool){
                len++;
            }
        }
        String[] answer = new String[len];
        for (int i = 0,idx=0; i < finished.length; i++) {
            if (!finished[i]){
                answer[idx] = todo_list[i];
                idx++;
            }
        }

        return answer;
    }

    public String[] solution2(String[] todo_list, boolean[] finished) {

        String[] answer = IntStream.range(0, finished.length)
                .filter(i -> !finished[i])
                .mapToObj(i -> todo_list[i])
                .toArray(String[]::new);

        return answer;
    }
}
