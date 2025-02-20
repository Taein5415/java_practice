package com.array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("홀수인 양의 정수를 입력하세요 : ");
        int num = sc.nextInt();
        int [] iarray = new int[num];

        if(num%2==1){
           for(int i=0;i<iarray.length;i++){
               if(i<iarray.length/2+1)
                   iarray[i] = i+1;
               else
                   iarray[i] = iarray.length-i;
           }
           for(int i=0;i<iarray.length;i++)
               System.out.print(iarray[i]+" ");
        }
        else{
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }
    }
}
