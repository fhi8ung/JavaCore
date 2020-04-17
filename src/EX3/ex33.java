package EX3;

import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào: ");
        String a = sc.nextLine();
        String[] b = a.split(" ");

        String x = "";
        int max = 0;

        for (int i = 1; i< b.length; i++) {
            if (b[i].length() > max) {
                max = b[i].length();
            }
        }
            for (int i = 0; i< b.length; i++){
                if (b[i].length() == max){
                    System.out.println("Tu dai nhat: " + b[i]);
                }
            }
        }
    }

