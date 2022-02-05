package com.delta.behavioralPattern.observerHeadFirstDesign;

public class ClientCode {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(45.6f, 45.69f, 9238f);
    }
}
