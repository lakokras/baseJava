import java.util.Scanner;

public class Program {

    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        int n = 0;

        do
        {
            System.out.print("Введите первое число: ");
            int num1 = in.nextInt();
            System.out.print("Введите второе число: ");
            int num2 = in.nextInt();
            System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);

            System.out.println("Для выхода из программы нажмите цифру 1, для подолжения любую другую цифру");
            n = in.nextInt();
        }
        while (n != 1);
        in.close();
    }
}
