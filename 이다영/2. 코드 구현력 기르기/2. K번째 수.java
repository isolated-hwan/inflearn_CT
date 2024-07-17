package main.java.org.example.inflearn.sec02;

import java.util.*;
import java.io.*;

// K번째 수
public class Inflearn2_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st1.nextToken());
            int s = Integer.parseInt(st1.nextToken());
            int e = Integer.parseInt(st1.nextToken());
            int k = Integer.parseInt(st1.nextToken());

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int index = 0;
            List<Integer> num = new ArrayList<>();
            for (int j = 1; j <= n; j++) {
                index++;

                if (s <= index && index <= e) {
                    num.add(j);
                }
            }
            Collections.sort(num);
            System.out.println("#" + (i+1) + " " + num.get(k));
        }
    }
}
