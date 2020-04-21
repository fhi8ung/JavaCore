package EX3;

import java.util.Scanner;

public class ex35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử: ");
        int n = sc.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++ ){
            System.out.println("Nhập vào phần tử thứ: " +(i+1)+" ");
            array [i] = sc.nextInt();
        }
        System.out.println("Mảng vừa nhập là: ");
        for (int i = 0; i < n; i++){
            System.out.print(array[i]+ " " );
        }
        
    }
}
