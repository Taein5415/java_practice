package com.array.level04.advanced;

import java.util.Arrays;

public class Application1 {
    public static void main(String[] args) {
        int [] lotto = new int[6];
        for(int i=0;i<lotto.length;i++)
            lotto[i] = (int)(Math.random()*45+1);
        Arrays.sort(lotto);
        for(int i=0;i<lotto.length;i++){
            System.out.print(lotto[i]+" ");
        }
    }
}
