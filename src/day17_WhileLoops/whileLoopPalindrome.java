package day17_WhileLoops;

import java.util.Scanner;

public class whileLoopPalindrome {
    public static void main(String[] args) {
        String str="level";
        String reversedStr="";
        int index=str.length()-1;
        while (index>=0){
            reversedStr+=str.charAt(index);
            index--;
        }
        System.out.println(reversedStr);
        boolean palindrome=reversedStr.equals(str);
        System.out.println(palindrome);
    }
}
