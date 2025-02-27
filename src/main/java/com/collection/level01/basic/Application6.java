package com.collection.level01.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Application6 {
    public static void main(String[] args) throws IOException {
        HashMap<String,String> phonebook = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s, name, phoneNum;
        while(true){
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            s = br.readLine();
            if(s.equals("exit")){
                break;
            }else if(s.equals("search")){
                System.out.print("검색 할 이름 : ");
                name = br.readLine();

                if((phoneNum=phonebook.get(name))==null){
                    System.out.println(name+"씨의 번호는 등록되어있지 않습니다.");
                }else{
                    System.out.println(name+"씨의 전화번호 : "+phoneNum);
                }
            }else {
                st = new StringTokenizer(s);
                if (st.countTokens() == 2) {
                    name = st.nextToken();
                    phoneNum = st.nextToken();
                    phonebook.put(name,phoneNum);
                    System.out.println("추가 완료 : "+name + " "+phoneNum);
                } else {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                    continue;
                }
            }

        }
    }
}
