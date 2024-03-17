package org.example.nadongbin.greedy.naki;

import java.util.Scanner;
import java.util.Arrays;

public class Chapter3_Q3 {

    public static void main(String[] args) {

        /*** 입력 부분 ***/
        Scanner scan = new Scanner(System.in);

        int row = scan.nextInt();
        int column = scan.nextInt();
        int[][] input = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                input[i][j] = scan.nextInt();
            }
        }

        /*** 문제 풀이 ***/
        for (int i = 0; i < row; i++) {
            Arrays.sort(input[i]);
        }

        int answer = 0;

        for (int i = 0; i < row; i++) {
            if (input[i][0] > answer) {
                answer = input[i][0];
            }
        }

        System.out.print("정답 : " + answer);

    }

}
