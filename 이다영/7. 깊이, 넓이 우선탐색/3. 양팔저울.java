package org.example.inflearn.sec07;

import java.io.*;

// 양팔저울
public class Inflearn7_3 {
    private static int k;
    private static int[] arr;
    private static boolean[] chk;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        k = Integer.parseInt(br.readLine());
        String[] tmp = br.readLine().split(" ");

        int s = 0;
        arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
            s += arr[i];
        }
        chk = new boolean[s + 1];
        findWeight(0, 0);

        int cnt = 0;
        for (int i = 1; i < s + 1; i++) {
            if (!chk[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void findWeight(int idx, int val) {
        if (idx == k) {
            if (val < 0) val *= -1;
            chk[val] = true;

        } else {
            findWeight(idx + 1, val + arr[idx]);
            findWeight(idx + 1, val - arr[idx]);
            findWeight(idx + 1, val);
        }
    }
}
