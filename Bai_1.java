import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai_1 {
    public static void shuffle(int[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        shuffle(numbers);
        System.out.println(Arrays.toString(numbers));
        
        scanner.close();
    }
}
// code by Hoang Le