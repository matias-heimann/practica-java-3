package com.company;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringUtils {

    public static String rpad(String s, char c, int n) {
        String repeatedChar = IntStream.range(0, n).mapToObj(i -> s).collect(Collectors.joining(""));
        return s + repeatedChar;
    }

    public static String trim(String s) {
        String s1 = new String(s);
        return s1.trim();
    }

    public static String ltrim(String s) {
        String str = new String(s);
        return str.replaceAll("^\\s+", "");
    }

    public static String rtrim (String s) {
        String str = new String(s);
        return str.replaceAll("\\s+$", "");
    }

    public static int indexOfN(String s, char c, int n){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
                if(count == n){
                    return i;
                }
            }
        }
        return -1;
    }
}
