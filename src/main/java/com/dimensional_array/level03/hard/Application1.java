package com.dimensional_array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width, height;
        while(true){
            System.out.print("가로 행의 수를 입력하세요 : ");
            width = sc.nextInt();
            System.out.print("세로 열의 수를 입력하세요 : ");
            height = sc.nextInt();
            if(width>=1 && width<=10 && height>=1 && height<=10)
                break;
            System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요");
        }


        char[][] alphabets = new char[height][width];
        for(int i=0;i<alphabets.length;i++){
            for(int j=0;j<alphabets[i].length;j++){
                alphabets[i][j] = (char)(Math.random()*('Z'-'A')+'A');
            }
        }
        System.out.println();
        System.out.println();

        for(int i=0;i<alphabets.length;i++){
            for(int j=0;j<alphabets[i].length;j++){
                System.out.print(alphabets[i][j]+" ");
            }
            System.out.println();
        }
        ;
    }
}
