public class Temperature {
    public static double convertTemp(Double temp, boolean entKelvin, boolean entCelsius, boolean entFahrenheit,
                                     boolean exitKelvin, boolean exitCelsius, boolean exitFahrenheit) {
        double tempConvertida = 0;
        if (entKelvin && exitCelsius){
            tempConvertida = temp - 273.15;

        } else if(entKelvin && exitFahrenheit){
            tempConvertida = ((temp -273.15)/5*9)+32;

        } else if (entFahrenheit && exitCelsius) {
            tempConvertida = (temp-32)/9*5;

        } else if (entFahrenheit && exitKelvin) {
            tempConvertida = ((temp-32)/9*5) + 273.15;

        } else if (entCelsius && exitFahrenheit) {
           tempConvertida = (temp/5*9)+32;

        } else if (entCelsius && exitKelvin) {
            tempConvertida = temp + 273.15;
        }

        return tempConvertida;
    }
}