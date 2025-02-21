package com.class_and_object.level01.basic.student.run;

import com.class_and_object.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
        StudentDTO[] studentDTOS = new StudentDTO[10];
        int count = 0;
        int grade, classroom, kor, eng, math;
        String name;
        // while문을 사용하여 학생들의 정보를 계속 입력 받고
        label:
        while(count<10){
            System.out.print("학년 : ");
            grade = sc.nextInt();
            System.out.print("반 :");
            classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 : ");
            name = sc.nextLine();
            System.out.print("국어점수 : ");
            kor = sc.nextInt();
            System.out.print("영어점수 : ");
            eng = sc.nextInt();
            System.out.print("수학점수 : ");
            math = sc.nextInt();
            sc.nextLine();
            studentDTOS[count] = new StudentDTO(grade, classroom, name, kor, eng, math);

            count++;

           while(true){
               System.out.print("계속 추가할 겁니까?(y/n) : ");
               char ch = sc.nextLine().charAt(0);
               if(ch=='n')
                   break label;
               else if (ch=='y')
                   break;
               else
                   System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }

        }
        // 3명 정도의 학생 정보를 입력 받아 각 객체에 저장함
        // 현재 기록된 학생들의 각각의 점수 평균을 구함
        // 학생들의 정보를 모두 출력 (평균 포함)
        for(int i=0;i<count;i++){
            System.out.println(studentDTOS[i].getInformation());
        }
    }
}
