package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClimbStairs {
    static int dp[];
    static int[] stairs;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] stairs = new int[N + 1];
        stairs[0] = 0;
        dp = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            stairs[i] = Integer.parseInt(br.readLine());
            dp[i] = stairs[i];
        }

        if (N >= 3) {
            dp[0] = stairs[0];
            dp[1] = stairs[1];
            dp[2] = stairs[1] + stairs[2];

            for (int i = 3; i < N + 1; i++) {
                dp[i] += Math.max(dp[i - 2], dp[i - 3] + stairs[i - 1]);
            }
        } else{
            if (N == 1) {
                dp[1] = stairs[1];
            } else if (N == 2) {
                dp[2] = stairs[1] + stairs[2];
            }
        }

        System.out.println(dp[N]);
    }
}
