package main.java.org.example.inflearn.sec06;

// 이진트리 순회 (깊이 우선 탐색)

public class Inflearn6_2 {
    public static void main(String[] args) {
        preOrder(1);    // 전위순회 출력
        System.out.println();
        inOrder(1);     // 중위순회 출력
        System.out.println();
        postOrder(1);
    }

    public static void preOrder(int v) {
        if (v < 8) {
            System.out.print(v + " ");
            preOrder(v * 2);
            preOrder(v * 2 + 1);
        }
    }

    public static void inOrder(int v) {
        if (v < 8) {
            inOrder(v * 2);
            System.out.print(v + " ");
            inOrder(v * 2 + 1);
        }
    }

    public static void postOrder(int v) {
        if (v < 8) {
            postOrder(v * 2);
            postOrder(v * 2 + 1);
            System.out.print(v + " ");
        }
    }
}
