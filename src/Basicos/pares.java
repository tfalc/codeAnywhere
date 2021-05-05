package Basicos;

import java.io.IOException;
import java.util.Scanner;

public class pares {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
    }
}