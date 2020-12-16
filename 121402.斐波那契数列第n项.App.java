package pac;

import java.util.Scanner;

public class App {
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int number = scan.nextInt();
        if(number < 40 && number > 1) {
            System.out.printf("斐波那契数列 of %d 是: %d\n",
                    number, fibonacci(number));
        }
    }
}
