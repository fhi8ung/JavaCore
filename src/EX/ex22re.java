package EX;

import java.util.Scanner;

public class ex22re {
    public static void main(String[] args) {
        String s= "";
        int n;
        System.out.println("Nhap vao so thap phan:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n> 0)
        {
            int i = n%2;
            s = i +s;
            n = n / 2;
        }
        System.out.println("so nhi phan la:" +s);
    }
}
