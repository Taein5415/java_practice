package com.collection.level01.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application1 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> scores = insertScores();
        printAverage(scores);
    }

    private static void printAverage(ArrayList<Integer> scores) {
        int sum = 0;
        for(int num : scores)
            sum+=num;
        double avg = (double)sum/ scores.size();
        System.out.println("학생 인원 : "+ scores.size());
        System.out.println("평균 점수 : "+avg);
    }

    private static ArrayList<Integer> insertScores() {
        ArrayList<Integer> scores = new ArrayList<>();
        label:
        while(true){
            System.out.print("학생 성적 : ");
            scores.add(sc.nextInt());
            sc.nextLine();
            System.out.print("추가 입력하려면 y : ");
            char c = sc.nextLine().charAt(0);
            while(true){
                if(c=='n')
                    break label;
                else if(c=='y')
                    break;
                else
                    System.out.println("다시 입력해주세요!");
            }
        }
        return scores;
    }
}
