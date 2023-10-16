import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        //3. Разработать консольное приложение, позволяющее находить корни квадратного
        //Уравнения
        //
        //Ax2 + Bx + C = 0 . В качестве исходных данных ввести A, B, C.
        //В результате вывести значения корней или соответствующее сообщение, если
        //действительных корней нет.

        double discriminant = 0;

        System.out.println("Введите значение A, B, C");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        System.out.println("A = " + a + ", B = " + b + ", C = " + c);

        discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней!");
        }

    }
}
