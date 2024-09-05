package org.example.inflearn.sec06;

import java.io.*;

// 인접행렬 (가중치 방향 그래프)
public class Inflearn6_12 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        int[][] arr = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            String[] tmp = br.readLine().split(" ");
            int s = Integer.parseInt(tmp[0]);
            int e = Integer.parseInt(tmp[1]);
            int v = Integer.parseInt(tmp[2]);

            arr[s][e] = v;
        }

        for (int i = 1; i < n + 1; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < n + 1; j++) {
                sb.append(arr[i][j]).append(" ");
            }
            System.out.println(sb);
        }
    }
}
