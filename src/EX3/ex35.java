package EX3;

import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ: " + (i + 1) + " ");
            array[i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }

        System.out.println("Trung binhg cộng của các số lẻ ỏ vị trí chẵn là:" + tbc(array));
    }
    public static float tbc ( int[] array){
        int n = array.length;
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1 && array[i] % 2 == 1) {
                tong += array[i];
                dem += 1;
            }
        }
        if (tong == 0) {
            return 0;
        } else {
            return (float) tong / dem;
        }
    }
}
