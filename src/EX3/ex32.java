package EX3;
import java.util.Arrays;
import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mảng thứ nhất");
        int[] a = {1,2,3,4};

        int[] b = {2,5,7, 8};
        int[] gopmang = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++){
            gopmang[i] = a[i];
        }
        for (int j = a.length; j < gopmang.length; j++){
            gopmang[j] = b[j-a.length];
        }
        Arrays.sort(a);
        for ( int i = 0 ; i < gopmang.length ; i++ ) {
            System.out.print(" " + gopmang[i]) ;
        }
    }
}

