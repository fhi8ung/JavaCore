package EX3;

import java.util.Arrays;
import java.util.Scanner;

public class ex32re2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử mảng 1: ");
        int a = sc.nextInt();
        int[] array1 = new int[a];
        System.out.println("Nhập phần tử mảng 1: ");
        for (int i = 0; i < a; i++) {
            array1[i] = sc.nextInt();
        }
        System.out.println("Nhập vào số phần tử mảng 2: ");
        int b = sc.nextInt();
        int[] array2 = new int[b];
        System.out.println("Nhập vào phần tử mảng 2: ");
        for (int i = 0; i < b; i++) {
            array2[i] = sc.nextInt();
        }
        int[] gopmang = new int[array1.length + array2.length];
        for (int i = 0; i < gopmang.length; i++) {
            if (i < array1.length) {
                gopmang[i] = array1[i];
            } else
                gopmang[i] = array2[i - array1.length];
        }
        //for (int j = array1.length; j < gopmang.length; j++) {
        //gopmang[j] = array2[j - array1.length];

        Arrays.sort(gopmang);
        for (int i = 0; i < gopmang.length; i++) {
            System.out.print(" " + gopmang[i]);
        }
    }
}

