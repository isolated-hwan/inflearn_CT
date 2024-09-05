package org.example.inflearn.sec06;

import java.io.*;

// 수들의 조합
public class Inflearn6_11 {
    private static int n;
    private static int k;
    private static int m;
    private static int[] arr;

    private static int[] com;
    private static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        n = Integer.parseInt(nk[0]);
        k = Integer.parseInt(nk[1]);

        arr = new int[n];
        String[] strArr = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(strArr[i]);
        }

        m = Integer.parseInt(br.readLine());

        com = new int[k];
        combination(0, 0);
        System.out.println(cnt);
    }

    public static void combination(int idx, int val) {
        if (idx == k) {
            int sum = 0;
            for (int x : com) {
                sum += x;
            }

            if (sum % m == 0) cnt++;

        } else {
            for (int i = val; i < n; i++) {
                com[idx] = arr[i];
                combination(idx + 1, i + 1);
            }
        }
    }
}
