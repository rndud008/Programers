package 기초;

import java.util.Scanner;
import java.util.stream.Collectors;

public class 대소문자바꿔서출력하기 {
    // 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
    // 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder sb = new StringBuilder();
        for (Character c : a.toCharArray()){
            System.out.println((int) c);
            sb.append((int) c >= 97 ? String.valueOf(c).toUpperCase() : String.valueOf(c).toLowerCase());
        }
        System.out.println(sb.toString());


        // 2.
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//        StringBuilder sb = new StringBuilder();
//
//        for (char c : a.toCharArray()) {
//            if (Character.isLowerCase(c)) {
//                sb.append(Character.toUpperCase(c));
//            } else {
//                sb.append(Character.toLowerCase(c));
//            }
//        }
//
//        System.out.println(sb.toString());

        // 3.
//        Scanner sc = new Scanner(System.in);
//        String a = sc.next();
//
//        String result = a.chars()
//                .mapToObj(c -> {
//                    if (Character.isLowerCase(c)) {
//                        return (char) Character.toUpperCase(c);
//                    } else {
//                        return (char) Character.toLowerCase(c);
//                    }
//                })
//                .map(String::valueOf)
//                .collect(Collectors.joining());
//
//        System.out.println(result);

    }
}
