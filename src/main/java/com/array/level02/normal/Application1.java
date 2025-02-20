package com.array.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String s = sc.nextLine();
        System.out.print("검색할 문자를 입력하세요 : ");
        char ch = sc.nextLine().charAt(0);

        int count=0;
        char[] carray = s.toCharArray();
        for(char c : carray){
            if(c==ch)
                count++;
        }
        System.out.println("입력하시 문자열 "+s+"에서 찾으시는 문자 "+ch+"은 "+count+"개 입니다.");

    }
}
