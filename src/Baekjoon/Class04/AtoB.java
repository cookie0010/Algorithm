package Baekjoon.Class04;

import java.io.*;
import java.util.*;

public class AtoB {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int cnt = 1;
        while (A != B) {
            if (A > B) {
                System.out.println(-1);
                return;
            }
            if (B % 10 == 1) {  // 1의 자릿수가 1이면
                B = B / 10;
            } else if (B % 2 == 0) {    // 2로 나누어 떨어지면
                B = B / 2;
            } else {
                System.out.println(-1);
                return;
            }

            cnt++;
        }

        System.out.println(cnt);
    }
}
