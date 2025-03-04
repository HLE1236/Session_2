import java.util.Scanner;
public class Bai_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i ++){
            a[i] = scanner.nextInt();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - 1; j++) {
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < n; i ++) {
            System.out.print(a[i] + " ");
        }
        scanner.close();
    }
}
// code by Hoang Le