package org.example.nadongbin.greedy.stella;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Chapter3_Q3 {

    public static void main(String arg[]){

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        Integer target[] = new Integer[n];

        for(int i=0; i<n; i++){
            int temp[] = new int[m];

            for(int j=0; j<m; j++){
                temp[j] = scanner.nextInt();
            }
            Arrays.sort(temp);
            target[i] = temp[0];
        }

        Arrays.sort(target, Comparator.reverseOrder());
        int answer = target[0];
        System.out.printf("answer :" + answer);

    }
}
