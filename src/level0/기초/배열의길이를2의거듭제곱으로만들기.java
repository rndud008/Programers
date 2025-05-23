package level0.기초;

public class 배열의길이를2의거듭제곱으로만들기 {
    // 정수 배열 arr이 매개변수로 주어집니다.
    // arr의 길이가 2의 정수 거듭제곱이 되도록
    // arr 뒤에 정수 0을 추가하려고 합니다.
    // arr에 최소한의 개수로 0을
    // 추가한 배열을 return 하는 solution 함수를 작성해 주세요.

    public int[] solution(int[] arr) {
        int value = (int) Math.ceil(Math.log(arr.length) / Math.log(2));
        int[] answer = new int[(int)Math.pow(2,value)];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }

}
