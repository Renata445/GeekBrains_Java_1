package Seminr1.Task;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        System.out.printf("Введите число n: ");
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("Сумма чисел от 1 до %d: %d%n", n, sum);
        num.close();
    }
}
