package Baekjoon.Class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Size {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        String[] str;
        for(int i=0;i<N;i++){
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        for(int i=0;i<N;i++){
            int cnt = 1;

            for(int j=0;j<N;j++){
                if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]) cnt++;
            }

            sb.append(cnt).append(" ");
        }
        System.out.println(sb);
    }
}