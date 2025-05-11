package level1;

public class 문자열내p와y의개수 {

    // 대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
    // s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
    // 다르면 False를 return 하는 solution를 완성하세요.
    // 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
    // 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
    // 예를 들어 s가 "pPoooyY"면 true를 return하고
    // "Pyy"라면 false를 return합니다.

    boolean solution(String s) {
        boolean answer = true;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        int pValue= (int) s.toLowerCase().chars().filter(c -> c == 'p').count();
        int yValue= (int) s.toLowerCase().chars().filter(c -> c == 'y').count();

        answer = pValue == yValue ;

        return answer;
    }

    boolean solution2(String s) {
        int diff = 0;                 // p 만나면 +1, y 만나면 –1
        for (char ch : s.toCharArray()) {
            switch (Character.toLowerCase(ch)) {
                case 'p' -> diff++;
                case 'y' -> diff--;
            }
        }
        return diff == 0;
    }
}
