package com.array.level02.normal;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호를 입력하세요 : ");
        String s = sc.nextLine();

        char [] carray = s.toCharArray();
        for(int i=8;i<carray.length;i++){
            carray[i]='*';
        }
        for(int i=0;i<carray.length;i++){
            System.out.print(carray[i]);
        }
    }
}
