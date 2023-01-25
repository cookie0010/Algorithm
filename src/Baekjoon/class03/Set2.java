package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Set2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[21];

        for(int i=0;i<M;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int idx;

            if(command.equals("add")){
                idx = Integer.parseInt(st.nextToken());
                arr[idx] = true;
            }else if(command.equals("remove")){
                idx = Integer.parseInt(st.nextToken());
                arr[idx] = false;
            }else if(command.equals("check")){
                idx = Integer.parseInt(st.nextToken());
                StringBuilder ans = arr[idx] ? sb.append("1\n") : sb.append("0\n");
            }else if(command.equals("toggle")){
                idx = Integer.parseInt(st.nextToken());
                arr[idx] = !arr[idx];
            }else if(command.equals("all")){
                for(int j=1;j<21;j++){
                    arr[j] = true;
                }
            }else{
                arr = new boolean[21];
            }
        }
        System.out.println(sb);
    }
}
