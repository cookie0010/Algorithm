package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class FashionKing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int cnt;

        for (int i = 0; i < T; i++) {
            HashMap<String, Integer> clothes = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            cnt = 1;

            for (int j = 0; j < n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String dummy = st.nextToken();
                String kind = st.nextToken();

                if(clothes.containsKey(kind)){
                    clothes.put(kind, clothes.get(kind) + 1);
                }else{
                    clothes.put(kind, 1);
                }
            }

            for (String str : clothes.keySet()) {
                cnt = cnt * (clothes.get(str) + 1);
            }

            sb.append(cnt - 1).append("\n");
        }

        System.out.println(sb);
    }
}
