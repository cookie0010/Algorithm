package Baekjoon.Class02;

import java.io.IOException;
import java.util.Scanner;

public class Size2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        int[][] arr = new int[N][2];

        String[] str;

        for(int i=0; i<N; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        for(int i=0; i<N; i++){
            int cnt = 1;

            for(int j=0;j<N;j++){
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) cnt++;
            }
            sb.append(cnt).append(" ");
        }
        System.out.println(sb);
    }
}
