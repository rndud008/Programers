package level0.입문;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class 모스부호1 {

    //머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
    // 그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
    // 문자열 letter가 매개변수로 주어질 때,
    // letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.

    public String solution(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] s = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String answer = "";
        StringBuilder sb= new StringBuilder();
        for (String str : letter.split(" ")){
            int index = List.of(morse).indexOf(str);
           sb.append(s[index]);
        }

        return sb.toString();
    }

    public String solution2(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};

        Map<String, String> morseMap = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], alphabet[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (String str : letter.split(" ")) {
            sb.append(morseMap.get(str));
        }

        return sb.toString();
    }

    public String solution3(String letter) {
        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
                "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
                "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t",
                "u", "v", "w", "x", "y", "z"};

        Map<String, String> morseMap = new HashMap<>();
        for (int i = 0; i < morse.length; i++) {
            morseMap.put(morse[i], alphabet[i]);
        }

        return Arrays.stream(letter.split(" "))
                .map(morseMap::get)
                .collect(Collectors.joining());
    }
}
