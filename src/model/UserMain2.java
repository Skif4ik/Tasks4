package model;

//2. Разработать класс, для хранения информации о пользователе: имя пользователя и
//год рождения. Создать в классе метод, вычисляющий возраст пользователя в
//заданном году.
//---------------------------------------------------------------------------------
//Дополнить класс пользователя из предыдущей задачи информацией месяце
//рождения (месяц и год хранить в виде целых типов). Создать метод, вычисляющий
//возраст человека в месяцах, а также методы возвращающие количество полных лет
//и количество полных месяцев прошедших с дня рождения (0 - 11).
public class UserMain2 {
    private String name;
    private int yearBirth;
    private int monthBirth;

    public UserMain2() {
    }

    public UserMain2(String name, int yearBirth, int monthBirth) {
        this.name = name;
        this.yearBirth = yearBirth;
        this.monthBirth = monthBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public int getMonthBirth() {
        return monthBirth;
    }

    public void setMonthBirth(int monthBirth) {
        this.monthBirth = monthBirth;
    }

    //полный лет
    public int userAge(int yearBirth) {
        int yearNow = 2023;
        int years = yearNow - yearBirth - 1;
        return years;
    }

    //  возраст в месяцах
    public int monthAge(int yearBirth, int monthBirth) {
        int months = (userAge(yearBirth)) * 12 + monthBirth;
        return months;
    }

    public void info() {
        System.out.println("Имя пользователя: " + name + ", год рождения: " + yearBirth + ", месяц рождения: " + monthBirth);
    }

    public void infoAge() {
        System.out.println("Возраст  пользователя: " + userAge(yearBirth));
    }

    public void infoAgeMonth() {
        System.out.println("Возраст  пользователя в месяцах: " + monthAge(yearBirth, monthBirth));
    }

}
