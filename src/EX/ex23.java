package EX;

public class ex23 {
    public static void main(String[] args) {
        System.out.print("so chia het cho 3: ");
        for (int i= 1; i <100; i ++){
            if(i%3==0)
                System.out.print(i+".");
        }
        System.out.print("\nso chia het cho 5:");
        for(int i = 1; i <100; i ++){
            if(i%5==0)
                System.out.print(i + ".");
        }
        System.out.print("\nso chia het cho ca 3 va 5: ");
        for(int i = 1; i <100; i ++){
            if(i%3==0 && i%5==0)
                System.out.print(i + ".");
        }
    }
}
