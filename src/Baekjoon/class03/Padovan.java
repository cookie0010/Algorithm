package Baekjoon.class03;

import java.io.*;

public class Padovan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        long[] dp = new long[100];

        // 초기 세팅
        dp[0] = dp[1] = dp[2] = 1;
        dp[3] = dp[4] = 2;

        // N=100 까지 dp 값 그냥 다 넣어버림
        for (int i = 5; i < 100; i++) {
            dp[i] = dp[i-1] + dp[i-5];
        }

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            sb.append(dp[N-1]).append("\n");
        }

        System.out.println(sb);
    }
}
