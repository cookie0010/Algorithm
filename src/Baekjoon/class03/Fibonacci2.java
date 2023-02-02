package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci2 {
    static int[] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int[] arrStart0 = new int[41];
            int[] arrStart1 = new int[41];

            arrStart0[0] = 1;
            arrStart0[1] = 0;
            arrStart1[0] = 0;
            arrStart1[1] = 1;

            int N = Integer.parseInt(br.readLine());

            for (int j = 2; j <= N; j++) {
                arrStart0[j] = arrStart0[j - 1] + arrStart0[j - 2];
                arrStart1[j] = arrStart1[j - 1] + arrStart1[j - 2];
            }

            sb.append(arrStart0[N]).append(" ").append(arrStart1[N]).append("\n");
        }
        System.out.println(sb);

    }
}
