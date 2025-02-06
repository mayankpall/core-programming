import java.util.Scanner;

public class WindChillTemperature {

    static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * (Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter temperature and wind speed to calculate wind chill temperature. ");

        System.out.print("Enter temperature : ");
        double temperature = input.nextDouble();

        System.out.print("Enter Wind Speed : ");
        double windSpeed = input.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.println("The wind chill temperature is : " + windChill);

        input.close();
    }
}
