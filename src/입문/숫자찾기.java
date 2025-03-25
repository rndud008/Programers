package 입문;

public class 숫자찾기 {
    // 정수 num과 k가 매개변수로 주어질 때,
    // num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
    // 없으면 -1을 return 하도록 solution 함수를 완성해보세요.

    public int solution(int num, int k) {
        int answer = 0;
        String findStr= String.valueOf(k);
        String[] arrStr = String.valueOf(num).split("");
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i].equals(findStr)){
                return i+1;
            }
        }
        return -1;
    }

    public int solution2(int num, int k) {
        String strNum = String.valueOf(num);
        int index = strNum.indexOf(String.valueOf(k));
        return index == -1 ? -1 : index + 1;
    }

    public int solution3(int num, int k) {
        String strNum = String.valueOf(num);
        char target = (char)(k + '0');

        for (int i = 0; i < strNum.length(); i++) {
            if (strNum.charAt(i) == target) {
                return i + 1;
            }
        }
        return -1;
    }


}
