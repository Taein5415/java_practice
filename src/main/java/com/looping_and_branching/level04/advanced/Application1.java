package com.looping_and_branching.level04.advanced;

import java.util.Scanner;

/*
 * -- 입력 예시 --
 * 문자열을 입력하세요 : a B z
 * 숫자를 입력하세요 : 4
 *
 * -- 출력 예시 --
 * e F d
 *
 * -- 입력 예시 --
 * 문자열을 입력하세요 : a B z
 * 숫자를 입력하세요 : 27
 *
 * -- 출력 예시 --
 * b C a
 * */
public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String s = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        char[] charArr = s.toCharArray();
        for(int i=0;i<charArr.length;i++){
            if(charArr[i]>='a' && charArr[i]<='z')
                charArr[i] = (char)((charArr[i]+num-'a')%26+'a');
            else if(charArr[i]>='A' && charArr[i]<='Z')
                charArr[i] = (char)((charArr[i]+num-'A')%26+'A');
        }
        System.out.println(String.valueOf(charArr));
    }

}
