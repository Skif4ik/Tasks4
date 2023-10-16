import model.Temperature;

public class Main6 {
    //6. Разработать класс для перевода градусов Фаренгейта в градусы Цельсия и
    //обратно. Создать в классе 2 статических метода для перевода. В консольном
    //приложении проверить работу созданного класса
    public static void main(String[] args) {

        Temperature temperature1 =new Temperature(50.0);
        System.out.println("Температура в Цельсиях "+Temperature.calculation(50.0));//10

        Temperature temperature =new Temperature(25);
        System.out.println("Температура в Фаренгейт "+Temperature.calculation(25)); //77

    }
}
