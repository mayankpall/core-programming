import java.util.Scanner;

public class FactorialUsingFor {
    static int calculateFactorial(int number) {
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number to find factorial : ");
        int number = input.nextInt();

        if (number < 0) {
            System.out.println("Enter a positive number.");
        } else {
            int factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        input.close();
    }
}
