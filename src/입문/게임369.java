package 입문;

public class 게임369 {
    // 머쓱이는 친구들과 369게임을 하고 있습니다.
    // 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
    // 머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.

    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);

        for (char  c : str.toCharArray()){
            String value = String.valueOf(c);
            if (value.equals("3") || value.equals("6") || value.equals("9")){
                answer++;
            }
        }
        return answer;
    }

    public int solution2(int order) {
        int answer = (int) String.valueOf(order)
                .chars()
                .filter(c -> c == '3' || c == '6' || c == '9')
                .count();
        return answer;
    }

    public int solution3(int order) {
        char[] arr = String.valueOf(order).toCharArray();
        int answer = 0;

        for (char c : arr) {
            if (c == '3' || c == '6' || c == '9') {
                answer++;
            }
        }
        return answer;
    }

    public int solution4(int order) {
        String str = String.valueOf(order).replaceAll("[^369]", "");
        int answer = str.length();
        return answer;
    }


}
