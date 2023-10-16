import model.User1;

public class Main7 {
    public static void main(String[] args) {
        User1[] user1s = {
                new User1("Vasya"),
                new User1("Misha"),
                new User1("Masha")
        };

        User1.showCounterUser(user1s);
    }

}
