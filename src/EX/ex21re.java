package EX;

import java.util.Scanner;

public class ex21re {
    public static void main(String[] args) {
        System.out.println("Nhap vao so dong:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < n; i++){
            for(int a = 1; a <= n - i; a++){    //Tạo vòng lặp giảm dần từ trên xuống cho " "
                System.out.print(" ");
            }
            for(int b = 1; b <= 2 * i -1; b++){ //Tạo vòng lặp in ra "*" theo thứ tự tăng dần
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
