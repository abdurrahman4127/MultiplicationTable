import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("multiplication table of : ");
        int n = scanner.nextInt();

        for (int i=1 ; i<=10; i++) {
            System.out.printf("%d * %d = %d\n",n, i, n*i);
        }
    }
}
