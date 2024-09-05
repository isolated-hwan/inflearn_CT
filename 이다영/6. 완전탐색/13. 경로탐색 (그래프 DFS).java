package org.example.inflearn.sec06;

import java.io.*;

// 경로탐색 (그래프 DFS)
public class Inflearn6_13 {
    private static int n;
    private static int m;
    private static int[][] arr;
    private static boolean[] visited;
    private static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);
        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i < m; i++) {
            String[] tmp = br.readLine().split(" ");
            int s = Integer.parseInt(tmp[0]);
            int e = Integer.parseInt(tmp[1]);
            arr[s][e] = 1;
        }

        visited[1] = true;
        findRoute(1);
        System.out.println(cnt);
    }

    public static void findRoute(int val) {
        if (val == n) {
            cnt++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (!visited[i] && arr[val][i] == 1) {
                    visited[i] = true;
                    findRoute(i);
                    visited[i] = false;
                }
            }
        }
    }
}
