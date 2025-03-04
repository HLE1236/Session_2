import java.util.Scanner;

public class Bai_1_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle ci = new Circle();
        Square sq = new Square();
        double n = scanner.nextDouble();
        ci.setR(n);
        sq.setSide(n);
        System.out.println("Dien tich hinh vuong la: " + sq.getArea());
        System.out.println("Chu vi hinh vuong la: " + sq.getPa());
        System.out.println("Dien tich hinh tron la: " + ci.getArea());
        System.out.println("Chu vi hinh tron la: " + ci.getPa());
        scanner.close();
    }
}