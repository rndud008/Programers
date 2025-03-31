package 입문;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 외계어사전 {
    // PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다.
    // 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다.
    // spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1,
    // 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.

    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        for (String str : dic){
            int count = 0;
            for(String replace : spell){
                if(str.contains(replace)){
                    count ++;
                }
            }
            if (spell.length == count){
                return 1;
            }
        }
        return 2;
    }

    public int solution2(String[] spell, String[] dic) {
        Set<String> spellSet = new HashSet<>();
        for (String s : spell) {
            spellSet.add(s);
        }

        for (String word : dic) {
            Set<String> tempSet = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {
                tempSet.add(String.valueOf(word.charAt(i)));
            }

            if (tempSet.containsAll(spellSet)) {
                return 1;
            }
        }
        return 2;
    }

    public int solution3(String[] spell, String[] dic) {
        String sortedSpell = String.join("", spell);
        char[] chars = sortedSpell.toCharArray();
        Arrays.sort(chars);
        sortedSpell = new String(chars);

        for (String word : dic) {
            if (word.length() != spell.length) continue;

            char[] wordChars = word.toCharArray();
            Arrays.sort(wordChars);

            if (sortedSpell.equals(new String(wordChars))) {
                return 1;
            }
        }

        return 2;
    }
}
