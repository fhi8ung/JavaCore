package EX;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        int decimal_number, remember;
        String hexadecimal_number = "";
        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số decimal: ");
        decimal_number = sc.nextInt();
        while(decimal_number>0)
        {
            remember = decimal_number%16;
            hexadecimal_number = hex[remember] + hexadecimal_number;
            decimal_number = decimal_number/16;
        }
        System.out.println("Số hex là: " + hexadecimal_number);
    }
}
