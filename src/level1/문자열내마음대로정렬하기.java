package level1;

import java.util.*;


public class 문자열내마음대로정렬하기 {
    // 문자열로 구성된 리스트 strings와,
    // 정수 n이 주어졌을 때,
    // 각 문자열의 인덱스 n번째 글자를 기준으로
    // 오름차순 정렬하려 합니다.
    // 예를 들어 strings가 ["sun", "bed", "car"]이고
    // n이 1이면 각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
    public String[] solution(String[] strings, int n) {

        List<Svalue> svalueList = new ArrayList<>();
        for (String v : strings){
            svalueList.add(new Svalue(v.charAt(n), v));
        }
        svalueList.sort(Comparator.comparing((Svalue s )-> s.d).thenComparing(s -> s.fullString));

        String[] answer = new String[svalueList.size()];
        for (int i = 0; i <answer.length ; i++) {
            answer[i] = svalueList.get(i).fullString;
        }

        
        return answer;
    }
    
    static class Svalue{
        private char d;
        private String fullString;
        public Svalue (char d, String fullString){
            this.d = d;
            this.fullString = fullString;
        }
    }
}
