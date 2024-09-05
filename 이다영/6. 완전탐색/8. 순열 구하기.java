package org.example.inflearn.sec06;

import java.util.*;
// 순열 구하기
public class Inflearn6_8 {
    private static int n;
    private static int m;
    private static int[] arr;
    private static boolean[] visited;
    private static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m];
        visited = new boolean[n + 1];

        dfs(0);
        System.out.println(cnt);
    }

    public static void dfs(int idx) {
        if (idx == m) {
            for (int x : arr) {
                System.out.print(x + " ");
            }
            cnt++;
            System.out.println();

        } else {
            for (int i = 1; i <= n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    arr[idx] = i;
                    dfs(idx + 1);
                    visited[i] = false;
                }
            }
        }
    }
}
