package model;
//6. Разработать класс для перевода градусов Фаренгейта в градусы Цельсия и
//обратно. Создать в классе 2 статических метода для перевода. В консольном
//приложении проверить работу созданного класса
public class Temperature {
    private final static double COEFFICIENT1 = 1.8;
    private final static int COEFFICIENT2 = 32;
    private int celsius;
    private double fahrenheit;

    public Temperature(){

    }

    public Temperature(int celsius) {
        setCelsius(celsius);
    }
    public Temperature(double fahrenheit){
        setFahrenheit(fahrenheit);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(int celsius) {
        if (celsius >= -50 && celsius <= 50) {
            this.celsius = celsius;
        }
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        if (fahrenheit >= -58 && fahrenheit <= 122) {
            this.fahrenheit = fahrenheit;
        }
    }

    public static double calculation(int celsius) {
        double c = (celsius * COEFFICIENT1) + COEFFICIENT2;
        return c;
    }

    public static double calculation(double fahrenheit) {
        double f = (fahrenheit - COEFFICIENT2) / COEFFICIENT1;
        return f;
    }
}
