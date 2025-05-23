package level0.입문;

public class 옹알이1 {
    // 머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다.
    // 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다.
    // 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.

    public int solution(String[] babbling) {
        String[] keywords = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        for (String str : babbling){
            for (String key : keywords){
                str = str.contains(key) ? str.replace(key,"") : str;
            }
            answer += str.isEmpty() ? 1 : 0;
        }
        return answer;
    }

    public int solution2(String[] babbling) {
        int answer = 0;
        String pattern = "^(aya|ye|woo|ma)+$";

        for (String str : babbling) {
            if (str.matches(pattern)) {
                answer++;
            }
        }
        return answer;
    }

    public int solution3(String[] babbling) {
        String[] keywords = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for (String str : babbling) {
            int index = 0;
            while (index < str.length()) {
                boolean matched = false;
                for (String key : keywords) {
                    if (str.startsWith(key, index)) {
                        index += key.length();
                        matched = true;
                        break;
                    }
                }
                if (!matched) break;
            }
            if (index == str.length()) {
                answer++;
            }
        }
        return answer;
    }

}
