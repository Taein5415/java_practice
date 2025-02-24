package com.api.level01.basic;

import java.io.*;
import java.util.StringTokenizer;

public class Application1 {
    public static void main(String[] args) throws IOException {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        System.out.print("문자열 입력 : ");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = st.countTokens();
        StringBuilder sb = new StringBuilder();
        while(st.hasMoreTokens()){
            String s = st.nextToken();
            sb.append(s.toUpperCase().charAt(0) + s.substring(1)+" ");
        }
        bw.write("변환된 문자열: "+sb+'\n');
        bw.write("총 단어 개수: "+count);

        br.close();
        bw.close();
    }
}
