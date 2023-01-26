package Baekjoon.class03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class PokeMon {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        Map<Integer, String> map = new HashMap();
        Map<String, Integer> revMap = new HashMap<>();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N+1; i++) {
            String pokemon = br.readLine();
            map.put(i, pokemon);
            revMap.put(pokemon, i);
        }

        for (int i = 0; i < M; i++) {
            String test = br.readLine();
            char t = test.charAt(0);
            int n = (int)t;
            if (n<65) {
                int num = Integer.parseInt(test);
                sb.append(map.get(num)).append("\n");
            }else{
                sb.append(revMap.get(test)).append("\n");
            }
        }

        System.out.println(sb);
    }
}
