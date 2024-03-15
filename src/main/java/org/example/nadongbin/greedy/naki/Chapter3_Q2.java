package org.example.nadongbin.greedy.naki;

import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class Chapter3_Q2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] firstInput = scan.nextLine().split(" ");
        String[] secondInput = scan.nextLine().split(" ");

        int times = Integer.valueOf(firstInput[1]);
        int continuous = Integer.valueOf(firstInput[2]);

        Arrays.sort(secondInput, Collections.reverseOrder());
        
        int firstMax = Integer.valueOf(secondInput[0]);
        int secondMax = Integer.valueOf(secondInput[1]);

        int subtraction = firstMax - secondMax;
        int subtractionCount = times / (continuous + 1);

        int answer = firstMax * times - subtraction * subtractionCount;
        System.out.print("정답 : " + answer);

    }

}
