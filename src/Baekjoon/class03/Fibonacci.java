package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    static int zero;
    static int one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            zero = 0;
            one = 0;
            int N = Integer.parseInt(br.readLine());
            fibonacci(N);
            sb.append(zero).append(" ").append(one).append("\n");
        }
        System.out.println(sb);
    }

    private static void fibonacci(int n) {
        if (n == 0) {
            zero++;
        } else if (n == 1) {
            one++;
        } else {
            fibonacci(n - 1);
            fibonacci(n - 2);
        }
    }
}
