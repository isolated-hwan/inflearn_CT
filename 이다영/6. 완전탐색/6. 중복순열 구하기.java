package main.java.org.example.inflearn.sec06;

import java.util.*;

// 중복순열 구하기
public class Inflearn6_6 {
    private static int n;
    private static int c;
    private static int[] arr;
    private static int cnt = 0;
    private static int[] chk;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        c = sc.nextInt();
        arr = new int[n + 1];
        chk = new int[c];
        for (int i = 1; i < n + 1; i++) {
            arr[i] = i;
        }

        dfs(0);
        System.out.println(cnt);
    }

    public static void dfs(int idx) {
        if (idx == c) {
            for (int x : chk) {
                System.out.print(x + " ");
            }
            cnt++;
            System.out.println();

        } else {
            for (int i = 1; i < n + 1; i++) {
                chk[idx] = i;
                dfs(idx + 1);
            }
        }
    }
}
