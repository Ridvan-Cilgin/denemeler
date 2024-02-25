package lambdaDemo;

public class TermometerDemo {
    public static void main(String[] args) {

        CelciusToFahreneit celciusToFahreneit = (double c) -> c * 9 / 5 + 32;

//        System.out.println(calculator(-40, celciusToFahreneit));


//        PremiumThermometer celciusToFahreneit2 = (double c) -> c * 9 / 5 + 32;
//        PremiumThermometer fahreneitToCelcius = (double f,ThermosScale fromScale, ThermosScale toScale) -> (f - 32) * 5 / 9;
//PremiumThermometer celciusToFahreneit4 = (double c) -> c * 9 / 5 + 32;
//
//        PremiumThermometer celciusToFahreneit2 = (double c) -> c * 9 / 5 + 32;
//        PremiumThermometer celciusToFahreneit3 = (double c) -> c * 9 / 5 + 32;
//        PremiumThermometer celciusToFahreneit4 = (double c) -> c * 9 / 5 + 32;

    }

    public static double calculator(double celcius, CelciusToFahreneit celciusToFahreneit) {

        return celciusToFahreneit.getFahrenheit(celcius);

    }
}