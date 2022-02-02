import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	    double farenheit = insertFarenheitTemperature();
        double celsius = convertFarenheitToCelsius(farenheit);
        showResultOfConversion(celsius);
    }

    private static void showResultOfConversion(double celsius) {
        System.out.println("The conversion of farenheit to celsius is: "+celsius);
    }

    private static double convertFarenheitToCelsius(double farenheit) {
         return (farenheit - 32)*0.5556;
    }

    private static double insertFarenheitTemperature() {
        System.out.println("Insert temperature in farenheit");
        Scanner scan = new Scanner(System.in);
        return scan.nextDouble();
    }
}
