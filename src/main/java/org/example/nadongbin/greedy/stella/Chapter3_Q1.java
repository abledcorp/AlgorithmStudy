package org.example.nadongbin.greedy.stella;

import java.util.Scanner;

public class Chapter3_Q1 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int change = scanner.nextInt();

        int money[] = {500, 100, 50, 10};
        int answer = 0;

        for(int i : money){
            answer += change / i;
            change = change % i;
        }

        System.out.println("answer: " + answer);

    }


}


