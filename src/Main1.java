import model.User;

public class Main1 {
    //1. Разработать класс пользователь, содержащий поля логин, пароль и год
    //рождения. Создать конструктор с параметрами и по умолчанию, геттеры и
    //сеттеры, метод выводящий информацию. Создать два объекта класса
    //пользователь и продемонстрировать работу созданных методов.
    public static void main(String[] args) {
        User user1 = new User("Vasya", "qwerty1234", 1985);
        User user2 = new User("Kate", "zxcvb4321",1997);
        User user3 = new User();
        user3.setLogin("Misha");
        user3.setPassword("12345");
        user3.setYearBirth(1987);

        user1.info();
        user2.info();
        user3.info();

        System.out.println("=======================");
        System.out.println(user1.getLogin());
        user1.setPassword("vasya$vasya123456");
        System.out.println("Пользователь "+ user1.getLogin()+" изменил пароль");
        user1.info();


    }
}
