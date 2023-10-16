package model;
//5. Создать класс товар, содержащий наименование товара и его цену без скидки.
//5.1. Наименование товара и цену сделать свойствами
//5.2. Дополнить класс методом, возвращающим цену товара со скидкой 10%
//5.3. Перегрузить метод, возвращающий цену со скидкой, для возвращения цены
//товара с заданной произвольной скидкой.
//5.4. Создать метод для отображения данных объекта
//5.5. В консольном приложении создать товар и вывести о нём информацию.

public class Product {
    private String nameProduct;
    private double price;

    public Product() {
    }

    public Product(String nameProduct, double price) {
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    private static int discount;
    private final static int COEFFICIENT = 100;

    static {//блок кода
        discount = 10;
    }

    public double calculationDiscountPrice() { //возвращающий цену со скидкой
        double discountPrice = price - (price * discount / COEFFICIENT);
        return discountPrice;
    }

    public double calculationDiscountPrice(int discount) { //возвращающий цену с любой скидкой
        double discountPrice = 0;
        if (discount > 0 && discount < 100) {
            discountPrice = price - (price * discount / COEFFICIENT);
        } else {
            System.out.println("Некорректный ввод скидки");
        }
        return discountPrice;
    }

    public void showInfo() {
        System.out.println("Наименование: " + nameProduct +
                ", цена: " + price +
                ", цена со скидкой 10%: " + calculationDiscountPrice());
    }
}
