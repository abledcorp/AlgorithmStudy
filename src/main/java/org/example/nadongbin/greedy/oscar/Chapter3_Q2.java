package org.example.nadongbin.greedy.oscar;

import java.util.Arrays;
import java.util.Scanner;

public class Chapter3_Q2 {

    /*
    입력 예시 초기화 & 정답 출력
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstLineArray = scanner.nextLine().split(" ");
        String[] secondLineArray = scanner.nextLine().split(" ");
        int n = Integer.parseInt(firstLineArray[0]);
        int m = Integer.parseInt(firstLineArray[1]);
        int k = Integer.parseInt(firstLineArray[2]);
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(secondLineArray[i]);
        }

        System.out.println(new Chapter3_Q2().question(n, m, k, array));

    }

    /*
    문제 풀이
     */
    int question(int n, int m, int k, int[] array) {

        int answer = 0;
        int count = k;

        Arrays.sort(array);

        for (int i = 0; i < m; i++) {

            if (count != 0) {
                answer += array[n-1];
                count --;
            } else {
                answer += array[n-2];
                count = k;
            }

        }

        return answer;

    }

}
