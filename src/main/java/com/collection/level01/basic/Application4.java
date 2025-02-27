package com.collection.level01.basic;

import java.util.HashSet;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        HashSet<String> idList = new HashSet<>();
        String s;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            s = sc.nextLine();
            if(s.equals("exit"))
                break;
            if(idList.contains(s))
                System.out.println("이미 등록된 ID입니다.");
            else{
                idList.add(s);
                System.out.println("ID가 추가 되었습니다.");
            }
        }
        System.out.println("모든 학생의 ID : "+idList);
    }
}
