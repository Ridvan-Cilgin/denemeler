package lambdaDemo;
@FunctionalInterface
public interface PremiumThermometer {
    double getTemperature(double deegres,ThermosScale fromScale,ThermosScale toScale);
}
