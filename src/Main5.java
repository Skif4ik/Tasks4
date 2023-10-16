import model.Product;

public class Main5 {
//5. Создать класс товар, содержащий наименование товара и его цену без скидки.
//5.1. Наименование товара и цену сделать свойствами
//5.2. Дополнить класс методом, возвращающим цену товара со скидкой 10%
//5.3. Перегрузить метод, возвращающий цену со скидкой, для возвращения цены
//товара с заданной произвольной скидкой.
//5.4. Создать метод для отображения данных объекта
//5.5. В консольном приложении создать товар и вывести о нём информацию.
    public static void main(String[] args) {
        Product product1 = new Product("kofe", 15);
        System.out.println(product1.calculationDiscountPrice());

        System.out.println(product1.calculationDiscountPrice(20));

        product1.showInfo();

    }
}
