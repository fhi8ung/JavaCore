package EX3;

import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        System.out.println("Nhập vào mảng: ");
        Scanner ssc = new Scanner(System.in);
        String input = ssc.nextLine();
        String[] phantu = input.split(", ");
        int n = phantu.length;

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(phantu[i]);
        }
        int max = 0;
        int d = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i + 1] - a[i] == 1) {
                d++;
                if (d > max)
                    max = d;
                } else
                    d = 1;
            }
            System.out.println("Độ dài lớn nhất là: " + max);
    }
}