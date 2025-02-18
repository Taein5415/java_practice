package com.greedy.level02.normal;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        int rand = (int) (Math.random() * (max - min+1) + min);
        return rand;
    }

    public static String randomUpperAlphabet(int length) {
        int rand ;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < length; i++){
            rand = (int) (Math.random() * (90 - 65+1) + 65);
            sb.append((char)rand);
        }
        return sb.toString();
    }

    public static String rockPaperScissors() {
        String [] command = {"가위","바위","보"};
        int rand = (int)(Math.random()*3);
        return command[rand];
    }
    public static String tossCoin(){
        String [] coin = {"앞면","뒷면"};
        int rand = (int)(Math.random()*2);
        return coin[rand];
    }

}
