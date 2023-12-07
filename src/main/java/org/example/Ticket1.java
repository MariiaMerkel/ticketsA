package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ticket1 {

    public static void arrRevers(int[] ints) {
        int[] intsRevers = new int[ints.length];
        int c = 0;
        for(int i = ints.length; i > 0; i-- ){
            intsRevers[c++] = ints[i-1];
        }
        System.out.println(Arrays.toString(intsRevers));
    }
}
