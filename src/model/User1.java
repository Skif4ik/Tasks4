package model;

public class User1 {
    //  7.1. Создать класс User1, содержащий поле – userName и статическое поле
    //userCount.
    //7.2. Создать статический инициализатор класса, конструктор класса,
    //инициализирующий поле класса и изменяющий значение userCount.
    //7.3. Создать массив пользователей и проинициализировать их константными
    //значениями.
    //7.4. Создать метод в классе User1, выводящий количество созданных пользователей.

    private static int userCount;
    private static int id;
    private String userName;

    static {
        userCount = 0;
    }
    {
        id=++userCount;
    }

    public User1() {
    }

    public User1(String userName) {
        this.userName = userName;
    }

    public static int getUserCount() {
        return userCount;
    }

    public static void setUserCount(int userCount) {
        User1.userCount = userCount;
    }


    public static void showCounterUser(User1[] user1s) {
//        for (User1 user : user1s) {
//        }
        System.out.println("Количество созданных пользователей: " + userCount);
    }
}
