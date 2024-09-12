package main.java.org.example.inflearn.sec07;

import java.util.*;

// 알파코드
public class Inflearn7_6 {

    private static int n;
    private static int[] code;
    private static int[] res;
    private static int cnt;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tmp = sc.nextLine().split("");

        n = tmp.length;
        code = new int[n + 1];
        res = new int[n + 3];
        for (int i = 0; i < n; i++) {
            code[i] = Integer.parseInt(tmp[i]);
        }
        code[n] = -1;

        findCode(0, 0);
        System.out.println(cnt);

    }

    public static void findCode(int idx, int val) {
        if (val == n) {
            cnt++;
            for (int i = 0; i < idx; i++) {
                System.out.print((char) (res[i] + 64) + "");
            }
            System.out.println();

        } else {
            for (int i = 1; i < 27; i++) {
                if (code[val] == i) {

                    res[idx] = i;
                    findCode(idx + 1, val + 1);

                } else if (i >= 10 &&
                        code[val] == i / 10 &&
                        code[val + 1] == i % 10) {

                    res[idx] = i;
                    findCode(idx + 1, val + 2);
                }
            }
        }
    }
}
