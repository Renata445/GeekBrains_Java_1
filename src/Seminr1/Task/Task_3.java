package Seminr1.Task;

public class Task_3 {
    public static void main(String[] args) {
        int i, j;
        boolean a;
        for (i = 2; i < 100; i++) {
            a = true;
            for (j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    a = false;
                    break;
                }
            }
            if (a) {
                System.out.println(i + " простое");
            }
        }
    }
}
