package org.example.nadongbin.greedy.stella;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Chapter3_Q2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String firstLine[] = scanner.next().split(" ");
        String secondLine[] = scanner.next().split(" ");

        int condition[] = new int[3];

        for(int i = 0; i < 3; i++){
            condition[i] = Integer.valueOf(firstLine[i]);
        }

        Integer numberList[] = new Integer[condition[0]];

        for(int i = 0; i < condition[0]; i++){
            numberList[i] = Integer.valueOf(secondLine[i]);
        }

        Arrays.sort(numberList, Collections.reverseOrder());

        int times = condition[1] / condition[2];
        int plus = condition[1] % condition[2];

        int answer = (numberList[0] * times  * condition[2]) + (numberList[1] * plus);

        System.out.println("answer : " + answer);

    }
}
