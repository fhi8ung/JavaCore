package EX;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sonhiphan, sothapphan = 0, i = 1, nho;
        System.out.println("Nhập vào số nhị phân: ");
        sonhiphan = sc.nextLong();
        while (sonhiphan != 0){
            nho = sonhiphan % 10;
            sothapphan = sothapphan + nho * i;
            i=i*2;
            sonhiphan = sonhiphan / 10;
        }
        System.out.println("Số thập phân là: " + sothapphan);
    }
}
