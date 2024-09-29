public class CoffeeShop {
    private static CoffeeShop instance;

    // Приватный конструктор для предотвращения создание объекта снаружи
    private CoffeeShop() {
    }

    // Метод для получения инстанса класса
    public static synchronized CoffeeShop getInstance() {
        if (instance == null) {
            instance = new CoffeeShop();
        }
        return instance;
    }

    public void placeOrder(Order order) {
        System.out.println("Заказ: " + order);
    }

    // По желанию можно добавить доп методы
}
