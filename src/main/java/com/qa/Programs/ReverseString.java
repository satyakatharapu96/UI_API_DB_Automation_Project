package com.qa.Programs;

public class ReverseString {
    public static void main(String[] args) {
        String str = "I want to become a Software Test Engineer";
        int len = str.length();
        String rev = "";
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println("reversed String is:" + rev);
        System.out.println("--------------------");
        // By using tocharArray:
        char ch[] = str.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print("reverse string is:" + ch[i]);
        }



    }
   //by using recursion



    }



