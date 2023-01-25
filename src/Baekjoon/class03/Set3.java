package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Set3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        int ans = 0;  // 비트 연산

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if(command.equals("all")){
                ans = (1 << 21) - 1;

            }else if(command.equals("empty")){
                ans = 0;

            }else{
                int num = Integer.parseInt(st.nextToken());
                if(command.equals("add")){
                    ans = ans | (1 << (num - 1));

                }else if(command.equals("remove")){
                    ans = ans & ~(1 << (num - 1));
                    // 나머지를 다 1로 만들고 & 연산

                }else if(command.equals("check")){
                    sb.append((ans & (1 << (num - 1))) == 0 ? 0 : 1).append("\n");

                }else if(command.equals("toggle")){
                    ans = ans ^ (1 << (num - 1));

                }
            }
        }

        System.out.println(sb);
    }
}
