package Baekjoon.class03;

import java.io.*;
import java.util.StringTokenizer;

public class PrefixSum4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int[] sum = new int[N];

        // N 개의 수 입력받음
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // 누적합 구하기
        sum[0] = arr[0];
        for (int i = 1; i < N; i++) {
            sum[i] = arr[i] + sum[i - 1];
        }

        // 각 케이스에 대한 구간합
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ans = 0;

            if (start == 1) {
                ans = sum[end-1];
            }else{
                ans = sum[end-1] - sum[start-2];
            }

            sb.append(ans).append("\n");
        }

        System.out.println(sb);
    }
}
