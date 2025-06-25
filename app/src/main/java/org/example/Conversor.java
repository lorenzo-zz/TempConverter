package org.example;

public class Conversor {

    public double toFahrenheit(int temp){
        return (temp * 1.8) + 32;
    }

    public double toCelsius(int temp){
        return (temp -32) * 0.55;
    }
}
