package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Application2 {
    private final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<>();
        String s;
        while(true){
            s = getURL();
            if(s.equals("exit"))
                break;
            stack.push(s);
            printRecentURL(stack);
        }
    }

    private static void printRecentURL(Stack<String> stack) {
        int len = Math.max(stack.size()-5,0);
        System.out.print("최근 방문 url : [");
        for(int i = stack.size()-1; i>=len; i--){
            System.out.print(stack.get(i));
            if(i==len)
                System.out.print("]");
            else
                System.out.print(",");
        }
        System.out.println();
    }

    private static String getURL() throws IOException {
        System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
        return br.readLine();
    }
}
