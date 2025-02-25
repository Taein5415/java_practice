package com.io.level01.basic.file_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * (존재하는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : hello.txt
         *
         * ----- 출력 예시 -----
         *
         * ===== 파일 내용 출력 =====
         * 안녕하세요. 반갑습니다. 제 이름은 홍길동입니다.
         *
         * ----- 입력 예시 -----
         *
         * (존재하지 않는 파일명을 입력한 경우)
         * 파일 이름을 입력하세요 : unknown.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : 해당 이름을 가진 파일이 없습니다.
         *
         */
        FileReader fr = null;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("파일 이름을 입력하세요 : ");
            String fname = sc.nextLine();
            fr = new FileReader(fname);
            char [] carr = new char[(int)new File("hello.txt").length()];
            fr.read(carr);
            for(int i=0;i<carr.length;i++)
                System.out.print(carr[i]);

        } catch (FileNotFoundException e) {
            System.out.println("해당 이름을 가진 파일이 없습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fr!=null)
                    fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
