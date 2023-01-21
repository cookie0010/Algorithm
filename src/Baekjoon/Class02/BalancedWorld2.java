package Baekjoon.Class02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class BalancedWorld2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        while(true){
            Stack<Character> stack = new Stack<>();
            String s = sc.nextLine();
            if(s.equals(".")) break;

            for (int i = 0; i < s.length(); i++){
                Character c = s.charAt(i);

                if(c.equals('(') || c.equals('[')){
                    stack.push(c);
                    continue;
                }

                if(c.equals(')')){
                    if(stack.empty() || stack.pop() != '('){
                        stack.push('!');
                        break;
                    }
                }

                if(c.equals(']')){
                    if(stack.empty() || stack.pop() != '['){
                        stack.push('!');
                        break;
                    }
                }

            }
            if(stack.empty()) sb.append("yes\n");
            else sb.append("no\n");
        }

        System.out.println(sb);
    }
}
