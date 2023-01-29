package Baekjoon.class03;

import java.io.*;
import java.util.*;

public class DBJ {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Set<String> set = new HashSet<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();
            set.add(tmp);
        }

        List<String> result = new ArrayList<>();
        int cnt = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String tmp = st.nextToken();

            if (set.contains(tmp)) {
                result.add(tmp);
                cnt++;
            }
        }
        if(result.isEmpty()){
            System.out.println(0);
            return;
        }
        System.out.println(cnt);
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.toArray()[i]);
        }
    }
}
