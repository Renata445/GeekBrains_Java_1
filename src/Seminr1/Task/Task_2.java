package Seminr1.Task;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.printf("Введите число n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int proiz = 1;
        for (int i = 1; i <= n; i++) {
            proiz *= i;
        }
        System.out.printf("Произведение чисел от 1 до %d: %d%n", n, proiz);
        num.close();
    }
}
