package de.tum.in.ase.eist;

public final class TemperatureConverter {

    private TemperatureConverter() {
        // Private constructor because a utility class should not be instantiable.
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return celsius * (9.0 / 5.0) + 32.0;
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }


    public static double convertCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double convertKelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double convertFahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9 + 273.15;
    }

    public static double convertKelvinToFahrenheit(double kelvin) {

        return (kelvin - 273.15) * 9 / 5 + 32;

    }
    //TODO Task 2.2: Add Kelvin Converter Methods
}
