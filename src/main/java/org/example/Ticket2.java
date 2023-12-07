package org.example;

import java.util.Scanner;

public class Ticket2 {
    public static void isPalindrome(String str) {

        char[] chars = new char[str.length()];
        int c = 0;
        for(int i = str.length(); i > 0; i-- ){
            chars[c++] = str.charAt(i-1);
        }
        String strRevers = String.valueOf(chars);
        System.out.println(strRevers.equals(str) ? "Строка '" + str + "' является палиндромом" : "Строка '" + str + "' не является палиндромом");

    }
}
