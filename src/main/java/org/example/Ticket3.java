package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.base.Splitter;
import com.google.common.collect.Iterables;

public class Ticket3 {
        public static void splittingInHalf(String str)
        {

            //int size = (int) Math.round(str.length()*1.0/2);
            int size = str.length()/2 + str.length()%2;

            //1
            String[] tokens = str.split("(?<=\\G.{" + size + "})");
            System.out.println("первый вариант: " + Arrays.toString(tokens));

            //2
            List<String> tokens2 = new ArrayList<>();
            for (int start = 0; start < str.length(); start += size) {
                tokens2.add(str.substring(start, Math.min(str.length(), start + size)));
            }
            System.out.println("второй вариант: " + tokens2);

            //3
            List<String> tokens3 = Lists.newArrayList(Splitter.fixedLength(size).split(str));
            System.out.println("третий вариант: " + tokens3);

            //4
            String[] tokens4 = Iterables.toArray(Splitter.fixedLength(size).split(str),
                    String.class);
            System.out.println("четв-й вариант: " + Arrays.toString(tokens4));

            //5
            char[] chars = str.toCharArray();
            char[] array1 = Arrays.copyOfRange(chars, 0, chars.length / 2 + chars.length % 2);
            char[] array2 = Arrays.copyOfRange(chars, chars.length / 2 + chars.length % 2, chars.length);
            System.out.println("пятый  вариант:  " + new String(array1) + ", " + new String(array2));

            //6 - самый подходящий
            String[] strings = new String[2];
            strings[0] = str.substring(0, Math.min(str.length(), size));
            strings[1] = str.substring(size, Math.min(str.length(), size*2));
            System.out.println("шестой вариант: " + Arrays.toString(strings) + " самый подходящий");

        }
}
