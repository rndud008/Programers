package 기초;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class 전국대회선발고사 {
    // 0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다.
    // 등수가 높은 3명을 선발해야 하지만,
    // 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어
    // 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
    // 각 학생들의 선발 고사 등수를 담은
    // 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴
    // boolean 배열 attendance가 매개변수로 주어집니다.
    // 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때
    // 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.

    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;

        List<rnkUser> rnkUsers = new ArrayList<>();

        for (int i = 0; i < rank.length; i++) {
            rnkUsers.add(new rnkUser(rank[i],attendance[i], i));
        }

        rnkUsers.sort(Comparator.comparing(rnkUser -> rnkUser.rnk ));

        List<rnkUser> limit3 = rnkUsers.stream().filter(r -> r.attendance)
                .limit(3).collect(Collectors.toList());

        for (int i = 0; i < limit3.size(); i++) {
            if (i ==0){
                answer += 10000  * limit3.get(i).ord;
            } else if (i ==1) {
                answer += 100  * limit3.get(i).ord;
            }else {
                answer += limit3.get(i).ord;
            }
        }



        return answer;
    }

    static class rnkUser{
        int rnk;
        boolean attendance;
        int ord;
        public rnkUser (int rnk , boolean attendance, int ord){
            this.rnk = rnk;
            this.attendance = attendance;
            this.ord = ord;
        }

    }

    public int solution2(int[] rank, boolean[] attendance) {
        List<Integer> attended = new ArrayList<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                attended.add(i);
            }
        }

        attended.sort(Comparator.comparingInt(i -> rank[i]));

        return 10000 * attended.get(0) + 100 * attended.get(1) + attended.get(2);
    }


    public int solution3(int[] rank, boolean[] attendance) {
        record RnkUser(int rnk, int ord) {}

        return IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .mapToObj(i -> new RnkUser(rank[i], i))
                .sorted(Comparator.comparingInt(RnkUser::rnk))
                .limit(3)
                .reduce(0, (sum, user) -> {
                    int idx = IntStream.range(0, 3).filter(j ->
                            user.equals(new RnkUser(rank[j], j))
                    ).findFirst().orElse(0);
                    return switch (idx) {
                        case 0 -> sum + 10000 * user.ord();
                        case 1 -> sum + 100 * user.ord();
                        default -> sum + user.ord();
                    };
                }, Integer::sum);
    }

    public int solution4(int[] rank, boolean[] attendance) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < rank.length; i++) {
            if (attendance[i]) {
                list.add(i);
            }
        }

        list.sort(Comparator.comparingInt(i -> rank[i]));

        int[] weight = {10000, 100, 1};
        int answer = 0;

        for (int i = 0; i < 3; i++) {
            answer += list.get(i) * weight[i];
        }

        return answer;
    }



}
