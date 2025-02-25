package com.io.level01.basic.file_copy;

import java.io.*;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * (원본 파일이 존재 하는 경우)
         * 원본 파일의 이름을 입력하세요 : origin.txt
         * 복사 파일의 이름을 입력하세요 : copy.txt
         *
         * ----- 출력 예시 -----
         *
         * 파일 복사가 성공적으로 완료 되었습니다.
         *
         * ----- 입력 예시 -----
         *
         * (원본 파일이 존재하지 않는 경우)
         * 원본 파일의 이름을 입력하세요 : origin2.txt
         * 복사 파일의 이름을 입력하세요 : copy2.txt
         *
         * ----- 출력 예시 -----
         *
         * 오류 : origin2.txt (지정된 파일을 찾을 수 없습니다)
         *
         */
        FileReader fr = null;
        FileWriter fw = null;
        String originFname="", copyFname="";
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("원본 파일의 이름을 입력하세요 : ");
            originFname = sc.nextLine();
            System.out.print("복사 파일의 이름을 입력하세요 : ");
            copyFname = sc.nextLine();

            fr = new FileReader(originFname);
            char [] carr = new char[(int) new File(originFname).length()];
            fr.read(carr);

            fw = new FileWriter(copyFname);
            fw.write(carr);

            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (FileNotFoundException e) {
            System.out.println(originFname+" (지정된 파일을 찾을 수 없습니다)");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            if(fr!=null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
