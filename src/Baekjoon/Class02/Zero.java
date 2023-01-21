package Class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int sum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<K; i++){
            int N = Integer.parseInt(br.readLine());
            if(N==0){
                stack.pop();
            } else stack.push(N);
        }

        int n = stack.size();
        if(stack.empty()){
            System.out.println(0);
            return;
        }else{
            for(int i=0; i < n; i++){
                sum += stack.pop();
            }
        }

        System.out.println(sum);
    }
}
