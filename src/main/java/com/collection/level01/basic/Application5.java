package com.collection.level01.basic;

import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        TreeSet<String> dictionary = new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        String s;

        while(true){
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            s = sc.nextLine();
            if(s.equals("exit"))
                break;
            dictionary.add(s);
        }
        System.out.println("정렬된 단어 : "+dictionary);
    }
}
