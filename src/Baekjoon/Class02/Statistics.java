package Baekjoon.Class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class Statistics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] max = new int[8001];
        int maxCnt = 0;
        LinkedList<Integer> maxArr = new LinkedList<Integer>();

        // arr 배열에 값 입력
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 정렬
        Arrays.sort(arr);
        double sum = Arrays.stream(arr).sum();

        for(int a:arr){
            max[a+4000]++;
        }
        
        // 최대count 구하기
        for(int i=0;i<8001;i++)
            if(max[i]>maxCnt)
                maxCnt = max[i];
        
        for(int i=0;i<8001;i++){
            if(max[i]==maxCnt)
                maxArr.offer(i-4000);
        }
        if(arr.length == 1 || maxArr.size() == 1){
            System.out.println(maxArr.peek());
        }else{
            maxArr.removeFirst();
            System.out.println(maxArr.getFirst());
        }

        // 산술평균
        System.out.println(Math.round(sum/N));

        // 중앙값
        System.out.println(arr[N/2]);

        // 최빈값


        // 범위
        System.out.println(arr[N-1]-arr[0]);
    }
}