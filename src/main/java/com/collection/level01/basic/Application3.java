package com.collection.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    private final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        waitingSimulation();
    }

    private static void waitingSimulation() {
        Queue<String> line = new LinkedList<>();
        String name;
        while(true){
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            name = sc.nextLine();
            if(name.equals("next")) {
                pollNext(line);
            }else if(name.equals("exit")){
                break;
            }else {
                addCustomer(line, name);
            }
        }
    }

    private static void addCustomer(Queue<String> line, String name) {
        line.add(name);
        System.out.println(name + " 고객님 대기 등록 되었습니다.");
    }

    private static void pollNext(Queue<String> line) {
        if (line.isEmpty())
            System.out.println("대기 고객이 없습니다.");
        else
            System.out.println(line.poll() + " 고객님 차레입니다.");
    }
}
