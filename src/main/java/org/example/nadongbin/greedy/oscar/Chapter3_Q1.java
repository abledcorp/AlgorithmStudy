package org.example.nadongbin.greedy.oscar;

import java.util.Scanner;

public class Chapter3_Q1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(new Chapter3_Q1().question(scanner.nextInt()));

    }


    int question(int change) {

        int answer = 0;
        int[] coin = {500, 100, 50, 10};

        for (int i = 0; i <= 3; i++) {

            answer += change / coin[i];
            change = change % coin[i];

        }

        return answer;

    }


}
