package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Set1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if(s.equals("add")){
                String num = st.nextToken();
                set.add(num); // 중복 알아서 무시됨

            }else if(s.equals("remove")){
                String num = st.nextToken();
                set.remove(num);

            }else if(s.equals("check")){
                String num = st.nextToken();
                if(set.contains(num)){
                    sb.append("1\n");
                }else{
                    sb.append("0\n");
                }

            }else if(s.equals("toggle")){
                String num = st.nextToken();
                boolean b = set.contains(num) ? set.remove(num) : set.add(num);

            }else if(s.equals("all")){
                for (int j = 0; j < 20; j++) {
                    String tmp = Integer.toString(j+1);
                    set.add(tmp);
                }

            } else if(s.equals("empty")){
                set = new HashSet<>();

            }
        }
        System.out.println(sb);
    }
}
