import java.util.Scanner;

public class UnitConvertorTwo {


    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double convertYardsToFeet(double yards) {
        return yards * 3.0;
    }

    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unit Converter: Choose a Conversion");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.println("5. Yards to Feet");
        System.out.println("6. Feet to Yards");
        System.out.println("7. Meters to Inches");
        System.out.println("8. Inches to Meters");
        System.out.println("9. Inches to Centimeters");
        System.out.print("Enter your choice (1-9): ");

        int choice = input.nextInt();

        double value, convertedValue;

        switch (choice) {
            case 1:
                System.out.print("Enter distance in kilometers: ");
                value = input.nextDouble();
                convertedValue = convertKmToMiles(value);
                System.out.printf("Distance in miles: %.2f miles%n", convertedValue);
                break;

            case 2:
                System.out.print("Enter distance in miles: ");
                value = input.nextDouble();
                convertedValue = convertMilesToKm(value);
                System.out.printf("Distance in kilometers: %.2f km%n", convertedValue);
                break;

            case 3:
                System.out.print("Enter distance in meters: ");
                value = input.nextDouble();
                convertedValue = convertMetersToFeet(value);
                System.out.printf("Distance in feet: %.2f feet%n", convertedValue);
                break;

            case 4:
                System.out.print("Enter distance in feet: ");
                value = input.nextDouble();
                convertedValue = convertFeetToMeters(value);
                System.out.printf("Distance in meters: %.2f meters%n", convertedValue);
                break;

            case 5:
                System.out.print("Enter distance in yards: ");
                value = input.nextDouble();
                convertedValue = convertYardsToFeet(value);
                System.out.printf("Distance in feet: %.2f feet%n", convertedValue);
                break;

            case 6:
                System.out.print("Enter distance in feet: ");
                value = input.nextDouble();
                convertedValue = convertFeetToYards(value);
                System.out.printf("Distance in yards: %.2f yards%n", convertedValue);
                break;

            case 7:
                System.out.print("Enter distance in meters: ");
                value = input.nextDouble();
                convertedValue = convertMetersToInches(value);
                System.out.printf("Distance in inches: %.2f inches%n", convertedValue);
                break;

            case 8:
                System.out.print("Enter distance in inches: ");
                value = input.nextDouble();
                convertedValue = convertInchesToMeters(value);
                System.out.printf("Distance in meters: %.2f meters%n", convertedValue);
                break;

            case 9:
                System.out.print("Enter distance in inches: ");
                value = input.nextDouble();
                convertedValue = convertInchesToCentimeters(value);
                System.out.printf("Distance in centimeters: %.2f cm%n", convertedValue);
                break;

            default:
                System.out.println("Invalid choice! Please select a valid option.");
        }

        input.close();
    }
}

