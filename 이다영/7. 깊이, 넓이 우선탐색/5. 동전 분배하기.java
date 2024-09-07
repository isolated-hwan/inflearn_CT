package main.java.org.example.inflearn.sec07;

import java.util.Scanner;

// 동전 분배하기
public class Inflearn7_5 {
    private static int n;
    private static int[] coin;
    private static int val = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }

        sol(0, 0, 0, 0);
        System.out.println(val);
    }

    public static void sol(int idx, int a, int b, int c) {
        if (idx == n) {
            if (a != b && b != c && a != c) {
                int maxVal = Math.max(Math.max(a, b), c);
                int minVal = Math.min(Math.min(a, b), c);
                if (val > (maxVal-minVal)) {
                    val = maxVal - minVal;
                }
            }

        } else {
            sol(idx + 1, a + coin[idx], b, c);
            sol(idx + 1, a, b + coin[idx], c);
            sol(idx + 1, a, b, c + coin[idx]);
        }
    }
}
