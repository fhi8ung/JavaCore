package EX3;
import java.util.Scanner;
public class Activity35 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số phần tử:");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i<n ; i++){
                System.out.println("Nhập vào phần tử thứ "+(i+1)+":");
                arr[i] = sc.nextInt();
            }
            System.out.println("Mảng đã nhập:");
            for (int i = 0; i<n ; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println("\n1. Trung bình cộng các số lẻ ở vị trí chẵn là: "+average(arr));
            System.out.println("2. Phần tử lớn nhất trong mảng là: "+max(arr));
            System.out.println("3. Vị trí của các phần tử nhỏ nhất là: "+minIndex(arr));
            System.out.println("4. Các số chính phương trong mảng là: "+squareNum(arr));
            System.out.println("5. Các số nguyên tố trong mảng là: "+primeNumber(arr));
            System.out.println("6. Thay thế các phần tử âm bằng 0: "+replaceByZero(arr));
            System.out.println("7. Mảng sau khi xóa phần tử nhỏ hơn 0: "+delete(arr));
            System.out.println("8. Mảng sau khi sắp xếp giảm dần: ");
            bigToSmall(arr);
        }
        public static float average(int[] array){
            int n = array.length;
            int sum = 0;
            int dem = 0;
            for (int i = 0; i<n ; i++){
                if(i%2==1&&array[i]%2==1){
                    sum+=array[i];
                    dem+=1;
                }
            }
            if(sum==0){
                return -1;
            }else {
                return (float)sum/dem;
            }
        }
        public static int max(int[] array){
            int n = array.length;
            int max = array[0];
            for (int i = 0; i<n ; i++){
                if (array[i]>max){
                    max=array[i];
                }
            }
            return max;
        }
        public static String minIndex(int[] array){
            int n = array.length;
            String index = "";
            int min = array[0];
            for (int i = 0; i<n ; i++){
                if (array[i]<min){
                    min=array[i];
                }
            }
            for (int i = 0; i<n ; i++){
                if(array[i]==min){
                    index+=(i+1)+" ";
                }
            }
            return index;
        }
        public static String squareNum(int[] array){
            int n = array.length;
            String str = "";
            int t = 0;
            for (int i = 0; i<n ; i++){
                while(t*t <= array[i]){
                    if(t*t == array[i]){
                        str+=array[i]+" ";
                    }
                    ++t;
                }
            }
            return str;
        }
        public static boolean checkPrime(int k) {
            if(k<2) {
                return false;
            }else {
                int root = (int)Math.sqrt(k);
                for(int i=2; i<=root; i++) {
                    if(k%i==0) {
                        return false;
                    }
                }
            }
            return true;
        }
        public static String primeNumber(int[] array){
            int n = array.length;
            String str = "";
            for (int i = 0; i<n ; i++){
                if(checkPrime(array[i])){
                    str+=array[i]+" ";
                }
            }
            return str;
        }
        public static String replaceByZero(int[] array){
            int n = array.length;
            String str = "";
            for (int i = 0; i<n ; i++){
                if(array[i]<0){
                    str+=0+" ";
                }else {
                    str+=array[i]+" ";
                }
            }
            return str;
        }
        public static String delete(int[] array){
            int n = array.length;
            String str = "";
            for (int i = 0; i<n; i++){
                if(array[i]<0){
                    str+="";
                }else {
                    str+=array[i]+" ";
                }
            }
            return str;
        }
        public static void bigToSmall(int[] array){
            int temp = array[0];
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] < array[j]) {
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
            for (int i = 0; i < array.length; i++){
                System.out.print(array[i]+" ");
            }
        }
    }

