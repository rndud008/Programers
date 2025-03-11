package 입문;

public class 분수의덧셈 {
    //첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1,
    // 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
    // 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        long start = System.currentTimeMillis();
        int[] answer = {};

        int totalDenom1 = denom1 * denom2; // 분모끼리 곱을 하여 총 토탈을 구함
        int totalNumer1 = numer1* denom2 + numer2 * denom1; // 각 분자와 분모의 곱을 하여 토탈을 구함.
        int minNumber = Math.min(totalDenom1, totalNumer1); // Math 함수를 사용하여 가장 작은 숫자를 구함.

        int maxCount = 0;// 최대로 나눠지는 맥스_카운트를 구함
        for (int i = 1; i <= minNumber; i++) {
            // for문 루프를 돌때 i 는  minNumber 보다 작거나 같아야 한다
            if (totalNumer1 % i == 0 && totalDenom1 % i == 0){
                maxCount= i;
                // 해당 if 문 조건에 해당하면 maxCount 에 대입하여 갱신
            }

        }

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        return new int[]{totalNumer1/ maxCount, totalDenom1/ maxCount};
    }

    // 유클리드 호제법을 이용한 GCD 계산
    // 두 수를 나눈 나머지를 이용해서 재귀적으로 최대공약수를 찾는 방법
    private static int gcd(int a, int b){
        if (b == 0 ) return a;
        return gcd(b, a % b);
    }
    //

    public static int[] addFractions(int numer1, int denom1, int numer2, int denom2) {
        long start = System.currentTimeMillis();
        int totalDenom = denom1 * denom2;
        int totalNumer = numer1 * denom2 + numer2 * denom1;

        int gcdValue = gcd(totalNumer, totalDenom);

        long end = System.currentTimeMillis();

        System.out.println(end-start);

        return new int[]{totalNumer / gcdValue, totalDenom / gcdValue};
    }

    //최소공배수(LCM)를 이용해서 통분하면 불필요한 크기의 분모를 피할 수 있음
    private static int lcm(int a, int b){
        return (a * b) / gcd(a,b);
    }

    public static int[] addFractions2(int numer1, int denom1, int numer2, int denom2) {
        long start = System.currentTimeMillis();
        int commonDenom = lcm(denom1, denom2); // 최소공배수로 통분
        int totalNumer = (numer1 * (commonDenom / denom1)) + (numer2 * (commonDenom / denom2));

        int gcdValue = gcd(totalNumer, commonDenom); // 최대공약수로 약분

        long end = System.currentTimeMillis();
        System.out.println(end-start);

        return new int[]{totalNumer / gcdValue, commonDenom / gcdValue};
    }

    public static void main(String[] args) {
        System.out.println(solution(12345,23456,34567,45678)[1]);
        System.out.println(addFractions(12345,23456,34567,45678)[1]);
        System.out.println(addFractions2(12345,23456,34567,45678)[1]);
    }


}
