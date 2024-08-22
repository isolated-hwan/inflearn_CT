package main.java.org.example.inflearn.sec06;

import java.util.*;

// 부분집합 구하기 (DFS)
public class Inflearn6_3 {
    static int n;
    static int[] arr;
    static boolean[] chk;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        chk = new boolean[n + 1];
        arr = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = i;
        }

        dfs(1);

    }

    public static void dfs(int idx) {
        if (idx == n + 1) {
            for (int i = 1; i < n + 1; i++) {
                if (chk[i]) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        } else {
            chk[idx] = true;
            dfs(idx + 1);
            chk[idx] = false;
            dfs(idx + 1);
        }
    }
}
