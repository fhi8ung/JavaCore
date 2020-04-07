package EX;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chiều dài số Fibonacci: ");
        int x = sc.nextInt();
        System.out.println(x + " các số Fibonaci đầu tiên:");

        String fib = "";
        if (x == 1) {
            fib = "0";
        }

        else if (x == 2) {
            fib = "0, 1";
        }

        else {
            int U1 = 0;
            int U2 = 1;
            fib = U1 + ", " + U2;
            for (int i = 3; i <= x; i++) {
                int Un = U1 + U2;
                fib = fib + ", " + Un;
                U1 = U2;
                U2 = Un;
            }
        }
        System.out.print(fib);
    }
}
