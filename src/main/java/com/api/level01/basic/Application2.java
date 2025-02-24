package com.api.level01.basic;

import java.io.*;
import java.util.HashMap;
import java.util.Locale;
import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) throws IOException {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("문자열 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());

        HashMap<String,Integer> hashMap = new HashMap<>();
        while(st.hasMoreTokens()){
            String s = st.nextToken();

            if(isAlpha(s)){
                s = s.toLowerCase(Locale.ROOT);

            }
        }
    }
    public static boolean isAlpha(String s) {
        return s != null && s.matches("^[a-zA-Z]*$");
    }
}
