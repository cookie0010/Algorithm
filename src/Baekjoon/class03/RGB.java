package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB {
    static int[][] dp;
    static int[][] rgb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new int[N+1][3];
        rgb = new int[N+1][3];

        // 값 입력
        rgb[0][0] = rgb[0][1] = rgb[0][2] = 0;
        for (int i = 1; i < N+1; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                rgb[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // dp
        dp[1][0] = rgb[1][0];
        dp[1][1] = rgb[1][1];
        dp[1][2] = rgb[1][2];

        for (int i = 2; i < N+1; i++) {
            for (int j = 0; j < 3; j++) {
                dp[i][j] = rgb[i][j] + Math.min(dp[i - 1][(j + 1) % 3], dp[i - 1][(j + 2) % 3]);
            }
        }

        System.out.println(Math.min(Math.min(dp[N][0], dp[N][1]), dp[N][2]));
    }
}
