package org.example.nadongbin.greedy.naki;

import java.util.Scanner;

public class Chapter3_Q1 {

    public static void main(String[] args) {

        int[] coin = {500, 100, 50, 10};
        int answer = 0;

        Scanner scan = new Scanner(System.in);
        int change = scan.nextInt();

        for (int i : coin) {

            answer += change / i;
            change = change % i;

        }

        System.out.print("동전 개수 : " + answer);

    }

}
