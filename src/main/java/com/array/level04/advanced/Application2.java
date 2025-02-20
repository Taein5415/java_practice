package com.array.level04.advanced;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] iarray = new int[4];
        int rand;
        label :
        for(int i=0;i<iarray.length;i++){
            rand = (int)(Math.random()*9+1);
            for(int j=0;j<i;j++){
                if(rand==iarray[j]){
                    i--;
                    continue label;
                }
            }
            iarray[i] = rand;
        }
        System.out.println(Arrays.toString(iarray));
        int chance = 10;
        char[] insert;
        String s;
        int S,B;
        while(chance>0){
            S=0; B=0;
            System.out.println(chance+"회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            s = sc.nextLine();
            insert = s.toCharArray();
            for(int i=0;i<4;i++){
                int n = Character.getNumericValue(insert[i]);
                for(int j=0;j<4;j++){
                    if(n==iarray[j]){
                        if(i==j)
                            S++;
                        else
                            B++;
                    }
                }
            }
            if(S==4){
                System.out.println("정답입니다.");
                break;
            }
            else
                System.out.println("아쉽네요 "+S+"S "+B+"B 입니다.");
            chance--;
        }

    }
}
