package model;

//4. Решить задачу c квадратным уравнением, используя концепции ООП:
//4.1. Создать класс Equation c полями a, b, c
//4.2. Создать конструктор класса, принимающий значения a, b, c
//4.3. Создать приватный метод, вычисляющий дискриминант
//4.4. Создать метод, возвращающий логическое значение, показывающее, есть ли
//действительные корни или нет
//4.5. Создать методы, возвращающие значения x1 и x2. Если действительный корень
//один, то метод, возвращающий значение корня x2, должен вернуть значение null
public class Equation {

    private double a;
    private double b;
    private double c;

    public Equation() {

        this(2, 3, -5);
    }

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {

        return a;
    }

    public void setA(double a) {

        this.a = a;
    }

    public double getB() {

        return b;
    }

    public void setB(double b) {

        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    private double discriminant() {
        double d = 0;
        double a = getA();
        double b = getB();
        double c = getC();
        d = (b * b / 4.) - a * c;
        return d;
    }

    public void solution() {
        double a = getA();
        double b = getB();
        double c = getC();
        double d = discriminant();
        double x1 = 0;
        double x2 = 0;
        if (d < 0) {
            System.out.println("Для введенных значений A, B, C действительных корней нет");
        } else if (d == 0) {
            x1 = -1 * (b / 2.) / a;
            System.out.println("x1 = x2 = " + x1);
        } else {
            x1 = (-1 * b / 2. - Math.sqrt(d)) / a;
            x2 = (-1 * b / 2. + Math.sqrt(d)) / a;
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
    }
}