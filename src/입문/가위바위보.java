package 입문;
import java.util.*;
public class 가위바위보 {
    //가위는 2 바위는 0 보는 5로 표현합니다.
    // 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
    // rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록
    // solution 함수를 완성해보세요.

    public String solution(String rsp) {
        String answer = "";
        StringBuilder sb= new StringBuilder();
        for (String str : rsp.split("")){
            System.out.println(str);
            if (str.equals("0")){
                sb.append("5");
                continue;
            }
            if (str.equals("2")){
                sb.append("0");
                continue;
            }
            if (str.equals("5")){
                sb.append("2");
            }
        }
        return sb.toString();
    }

    public String solution2(String rsp) {
        Map<Character, Character> rspMap = Map.of('0', '5', '2', '0', '5', '2');
        StringBuilder sb = new StringBuilder();

        for (char ch : rsp.toCharArray()) {
            sb.append(rspMap.get(ch));
        }

        return sb.toString();
    }

    public String solution3(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (char ch : rsp.toCharArray()) {
            switch (ch) {
                case '0': sb.append('5'); break;
                case '2': sb.append('0'); break;
                case '5': sb.append('2'); break;
            }
        }
        return sb.toString();
    }
}
