package main.java.org.example.inflearn.sec07;

import java.util.*;
import java.io.*;

// 사과나무
public class Inflearn7_8 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] board = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(tmp[j]);
            }
        }

        int flag = 0;
        int sx = n / 2; int sy = n /2;
        int sum = board[sx][sy];
        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, -1};
        Deque<int[]> dq = new ArrayDeque<>();
        dq.addLast(new int[]{sx, sy});
        visited[sx][sy] = true;
        while(!dq.isEmpty()) {
            if (flag == n / 2) {
                break;
            }

            int size = dq.size();
            for (int i = 0; i < size; i++) {
                int[] tmp = dq.pollFirst();
                int x = tmp[0];
                int y = tmp[1];

                for (int j = 0; j < 4; j++) {
                    int xx = x + dx[j];
                    int yy = y + dy[j];

                    if(!visited[xx][yy]) {
                        sum += board[xx][yy];
                        visited[xx][yy] = true;
                        dq.addLast(new int[]{xx, yy});
                    }
                }
            }
            flag++;
        }

        System.out.println(sum);
    }
}
