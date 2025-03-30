package 입문;

public class 다항식더하기 {
    // 한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
    // 다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
    // 덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
    // 동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
    // 같은 식이라면 가장 짧은 수식을 return 합니다.

    public String solution(String polynomial) {
        int answer = 0;
        int xAnswer = 0;
        String[] strArr = polynomial.trim().split(" \\+ ");
        for (String str : strArr){
            if (str.contains("x")){;
                String part = str.replace("x","");
                xAnswer += part.trim().isEmpty() ? 1 : Integer.parseInt(part);
            }else {
                answer += Integer.parseInt(str);
            }
        }

        String result ="";
        if (xAnswer !=0){
            result = xAnswer == 1 ? "x": xAnswer+"x";
        }

        if (xAnswer !=0 && answer != 0){
            result += " + " + answer;
        }

        if (xAnswer == 0 && answer != 0){
            result += answer;
        }

        return result;
    }

    public String solution2(String polynomial) {
        int xSum = 0;
        int numSum = 0;

        for (String term : polynomial.split(" \\+ ")) {
            term = term.trim();
            if (term.contains("x")) {
                // "x"만 있는 경우는 계수가 1
                String coeff = term.replace("x", "");
                xSum += coeff.isEmpty() ? 1 : Integer.parseInt(coeff);
            } else {
                numSum += Integer.parseInt(term);
            }
        }

        if (xSum == 0) return String.valueOf(numSum);
        if (numSum == 0) return xSum == 1 ? "x" : xSum + "x";

        return (xSum == 1 ? "x" : xSum + "x") + " + " + numSum;
    }
}
