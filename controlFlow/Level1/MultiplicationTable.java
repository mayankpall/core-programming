import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = input.nextInt();

        System.out.println("Multiplication Table of " + number + " from 6 to 9:");

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        input.close();
    }
}
