package EX;

import java.util.Scanner;

public class ex251 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào n: ");
            int n = sc.nextInt();
            int tong = 0;
            int i = 0;
            while (i < n){
                i++;
                tong = tong + i;
            }
            System.out.println("Tổng là " + tong);
            float trungbinhcong = tong/n;
            System.out.println("Trung bình cộng là: " + trungbinhcong);
        }
    }
