package model;
//1. Разработать класс пользователь, содержащий поля логин, пароль и год
//рождения. Создать конструктор с параметрами и по умолчанию, геттеры и
//сеттеры, метод выводящий информацию. Создать два объекта класса
//пользователь и продемонстрировать работу созданных методов.
public class User {
    private String login;
    private String password;
    private int yearBirth;

    public User() {
    }

    public User(String login, String password, int yearBirth) {
        this.login = login;
        this.password = password;
        this.yearBirth = yearBirth;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public void info(){
        System.out.println("Логин: "+ login + ", пароль: " + password+ ", год рождения: " + yearBirth);
    }
}
