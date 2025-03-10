package 입문;

import java.io.InputStream;
import java.util.Arrays;
import java.util.stream.IntStream;

public class 배열두배만들기 {
    // 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
    public int[] solution(int[] numbers) {
        int[] answer = {};

        // for-each문
//        int index = 0;
//        for(int number: numbers){
//            numbers[index++] = number *2;
//        }

        //IntStream 사용
//        IntStream.of(numbers).map(number -> number * 2).toArray();

        //Parallel Stream 멀티 스레드 연산
//        Arrays.stream(numbers).parallel().map(number -> number * 2).toArray();

        // 기본 for 문
//        for (int i = 0; i < numbers.length ; i++) {
//            numbers[i] *= 2;
//        }
//        answer = numbers;

        // 재귀 함수.
//        doubleNumbersRecursive(numbers, 0);

        // 스트림 사용.
        return  Arrays.stream(numbers).map(number -> number * 2).toArray();
    }

    public static int[] doubleNumbersRecursive(int[] numbers, int index){
        if (index == numbers.length) return numbers;
        numbers[index] *= 2;
        return doubleNumbersRecursive(numbers, index +1);
    }

}
