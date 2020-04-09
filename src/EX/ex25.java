package EX;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào n: ");
        int n = sc.nextInt();
        int tong = 0;
        for(int i = 0; i <= n; i++ ) {
            tong = tong + i;
        }
        System.out.println("Tong là " + tong);
        float trungbinhcong = tong/n;
        System.out.println("Trung bình cộng là: " + trungbinhcong);
    }
}
