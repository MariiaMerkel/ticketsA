package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Ticket5 {
    public static int[] increaseEvenNumberByOne(int[] numbers){
        for (int i = 0; i < numbers.length; i++) numbers[i] = numbers[i] % 2 == 0 ? ++numbers[i] : numbers[i];
        return numbers;
    }
    public static void subArray(int[] numbers) {
        int[] subNumbers = new int[5];
        int c = 0;
        for (int i = 2; i < 7; i++) subNumbers[c++] = numbers[i];
        System.out.println(Arrays.toString(subNumbers));
    }
}
