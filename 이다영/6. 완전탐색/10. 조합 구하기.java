package org.example.inflearn.sec06;

// 조합 구하기

import java.util.*;

public class Inflearn6_10 {
    private static int n;
    private static int m;
    private static int[] arr;
    private static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[m];

        dfs(0, 1);
        System.out.println(cnt);
    }

    public static void dfs(int idx, int val) {
        if (idx == m) {
            for (int x : arr) {
                System.out.print(x + " ");
            }

            cnt++;
            System.out.println();

        } else {
            for (int i = val; i <= n; i++) {
                arr[idx] = i;
                dfs(idx + 1, i + 1);
            }
        }
    }
}
