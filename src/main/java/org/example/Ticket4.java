package org.example;

import java.util.Arrays;

public class Ticket4 {

    public static void duplicateDelete(String[] strings){
        String[] newStrings = new String[strings.length];
        int k = 0; // счётчик индекса финального массива и для подсчёта ненулевых элементов (это нужно чтобы указать размерность финального массива)
        boolean flag = false; // флаг совпадения строк

        // записываем в новый массив только неповторяющиеся элементы
        for(int i = 0; i < strings.length; i++){ // итерация по элементам входящего массива
            for(int c = 0; c < strings.length; c++){ // вложенная итерация по элементам входящего массива
                if (i != c) { // исключаем сравнение одинаковых элементов
                    flag = strings[i].equals(newStrings[c]);
                    if(flag) break; // прерываем вложенный цикл если есть совпадение элементов
                }
            }
            if(!flag) newStrings[k++] = strings[i]; // записываем элемент в новый цикл если совпадения не найдены
            flag = false; // "освежаем" флаг
        }

        String[] finalStrings = new String[k];
        int j = 0;

        // перезаписываем массив без нулевых элементов
        for(int i = 0; i < newStrings.length; i++){
            if (newStrings[i] != null) finalStrings[j++] = newStrings[i];
        }
        System.out.println(Arrays.toString(finalStrings));
    }

//    public static ArrayList<String> duplicateDelete2(String[] strings) {
//        ArrayList<String> al = (ArrayList<String>) Arrays.stream(strings).distinct().collect(Collectors.toList());
//        return al;
//    }

}
