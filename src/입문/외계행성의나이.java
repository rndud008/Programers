package 입문;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class 외계행성의나이 {

    //우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
    // 입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
    // a는 0, b는 1, c는 2, ..., j는 9입니다.
    // 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
    // 나이 age가 매개변수로 주어질 때 PROGRAMMER-962식
    // 나이를 return하도록 solution 함수를 완성해주세요.
    public String solution(int age) {
        String[] value = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        String answer = Arrays.stream(String.valueOf(age).split("")).map(str-> value[Integer.parseInt(str)]).collect(Collectors.joining());
        return answer;
    }

    public String solution2(int age) {
        String[] value = new String[]{"a","b","c","d","e","f","g","h","i","j"};

        return String.valueOf(age)
                .chars()
                .mapToObj(c -> value[c - '0']) // 숫자로 변환 후 매핑
                .collect(Collectors.joining());
    }

    public String solution3(int age) {
        Map<Character, String> map = new HashMap<>();
        char c = '0';
        for (String v : new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"}) {
            map.put(c++, v);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : String.valueOf(age).toCharArray()) {
            sb.append(map.get(ch));
        }

        return sb.toString();
    }

    public String solution4(int age) {
        String[] value = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        String strAge = String.valueOf(age);

        for (int i = 0; i < 10; i++) {
            strAge = strAge.replace(String.valueOf(i), value[i]);
        }

        return strAge;
    }

    public String solution5(int age) {
        String[] value = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        StringBuilder sb = new StringBuilder();

        String strAge = String.valueOf(age);
        for (int i = 0; i < strAge.length(); i++) {
            sb.append(value[strAge.charAt(i) - '0']); // '0'을 빼서 숫자로 변환
        }

        return sb.toString();
    }



}
