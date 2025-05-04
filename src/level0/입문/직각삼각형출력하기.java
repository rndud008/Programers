package level0.입문;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.stream.IntStream;

public class 직각삼각형출력하기 {
    // "*"의 높이와 너비를 1이라고 했을 때,
    // "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
    // 정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void solution() throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 1; i <= n; i++) {
            bw.write("*".repeat(i) + "\n");
        }
        bw.flush();
    }

    public void solution2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        IntStream.rangeClosed(1, n)
                .mapToObj(i -> "*".repeat(i))
                .forEach(System.out::println);
    }

    public void solution3() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append("*".repeat(i)).append("\n");
        }
        System.out.print(sb);
    }

}
