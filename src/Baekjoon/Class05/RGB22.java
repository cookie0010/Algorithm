package Baekjoon.Class05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RGB22 {
    static final int MAX = 1000 * 1000 + 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][3];
        int[][] rgb = new int[N][3];
        int min = MAX;

        // 비용 입력
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 3; j++) {
                rgb[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 세 가지 경우로 나눔. R로 시작, G로 시작, B로 시작
        for (int i = 0; i < 3; i++) {
            // RGB 중 하나 선택
            dp[0][i] = rgb[0][i];
            dp[0][(i+1)%3] = 1001;
            dp[0][(i+2)%3] = 1001;

            for (int j = 1; j < N; j++) {
                dp[j][0] = rgb[j][0] + Math.min(dp[j - 1][1], dp[j - 1][2]);
                dp[j][1] = rgb[j][1] + Math.min(dp[j - 1][0], dp[j - 1][2]);
                dp[j][2] = rgb[j][2] + Math.min(dp[j - 1][0], dp[j - 1][1]);
            }

            min = Math.min(Math.min(dp[N - 1][(i + 1) % 3], dp[N - 1][(i + 2) % 3]), min);
        }

        System.out.println(min);
    }
}
