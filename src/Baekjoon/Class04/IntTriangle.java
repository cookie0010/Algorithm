package Baekjoon.Class04;

import java.io.*;
import java.util.StringTokenizer;

public class IntTriangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] dp = new int[N][];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            dp[i] = new int[i+1];
            for (int j = 0; j < i + 1; j++) {
                int tri = Integer.parseInt(st.nextToken());
                dp[i][j] = tri;
            }
        }

        for (int i = 1; i < N; i++) {
            dp[i][0] += dp[i - 1][0];
            dp[i][i] += dp[i - 1][i - 1];
            for (int j = 1; j < i ; j++) {
                dp[i][j] += Math.max(dp[i - 1][j - 1], dp[i - 1][j]);
            }
        }

        int max = 0;
        for (int i = 0; i < N; i++) {
            max = max > dp[N - 1][i] ? max : dp[N - 1][i];
        }

        System.out.println(max);
    }
}
