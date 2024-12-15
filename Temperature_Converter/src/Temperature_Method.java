


public class Temperature_Method implements Controllable{




    @Override
    public void celsius_Fahrenheit(double celsius) {
        System.out.println(celsius * 9/5 + 32 + "° Fahrenheit");
    }


    @Override
    public void celsius_Kelvin(double celsius) {
        System.out.println(celsius + 273.15 + " Kelvin");
    }


    @Override
    public void fahrenheit_Celsius(double fahrenheit) {
        System.out.println((fahrenheit-32) * 5/9 + "° Celsius");
    }


    @Override
    public void fahrenheit_Kelvin(double fahrenheit) {
        System.out.println((fahrenheit-32) * 5/9 + 273.15 + " Kelvin");
    }


    @Override
    public void kelvin_Fahrenheit(double kelvin) {
        System.out.println((kelvin-273.15) * 9/5 + 32 + "° Fahrenheit");
    }

    @Override
    public void kelvin_Celsius(double kelvin) {
        System.out.println(kelvin - 273.15 + "° Celsius");
    }


}
