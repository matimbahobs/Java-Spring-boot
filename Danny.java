package io.javabrains.springbootstaterconveter;
import  org.springframework.stereotype.Service;

@Service


public class ConvensionService{

    private static float convertKelvinToCelsius (float kelvin)
    {

       return (float) (kelvin -  273.15); 
    }


   private static double convertPoundsToKilograms (double pounds)
    {
        double kg =  pounds*0.453592; 
       return kg;
    }

    private static float convertMilesToKilometers (float miles)
    {

        return (float) (miles*1,60934)
    }

}