package level0.입문;

public class 특정문자제거하기 {
    //문자열 my_string과 문자 letter이 매개변수로 주어집니다.
    // my_string에서 letter를 제거한 문자열을 return하도록 solution 함수를 완성해주세요.

    public String solution(String my_string, String letter) {
        String answer = "";
        return my_string.replaceAll(letter, "");
    }

    public String solution2(String my_string, String letter) {
        String answer = "";
        return String.join("", my_string.split(letter));
    }

    public String solution3(String my_string, String letter) {
        String answer = "";
        return my_string.chars()
                .filter(c -> c != letter.charAt(0))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public String solution4(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        for (char c : my_string.toCharArray()) {
            if (c != letter.charAt(0)) { // 단일 문자만 제거
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
