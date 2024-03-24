package org.example.nadongbin.bfsdfs.stella;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    int x;
    int y;

    public Node(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class Chapter5_Q2 {

    static int n, m;
    static int[][] map = new int[201][201];

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        scanner.nextLine();

        for(int i=0; i<n; i++){
            String row = scanner.nextLine();
            for(int j=0; j<m; j++){
                map[i][j] = row.charAt(j) - '0';
            }
        }
        int answer = findRoad(0, 0);
        System.out.println("answer :" + answer);

    }

    public static int findRoad(int x, int y){
        Queue<Node> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        queue.offer(new Node(x,y));

        while(!queue.isEmpty()){
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();

            for(int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx > n || ny > m) continue;

                if(map[nx][ny] == 0) continue;

                if(map[nx][ny] == 1){
                    map[nx][ny] = map[x][y] + 1;
                    queue.offer(new Node(nx, ny));
                }
            }

        }

        return map[n-1][m-1];
    }
}
