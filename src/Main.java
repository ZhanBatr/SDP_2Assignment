import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HouseholdGoodsComponent baseStore = new HouseholdGoodsStore();
        HouseholdGoodsComponent decoratedStore = new PriceInfoDecorator(baseStore); // декорация компонент
        HouseholdGoodsStore store = HouseholdGoodsStore.getInstance();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Добавить товар");
            System.out.println("2. Удалить товар");
            System.out.println("3. Вывести список товаров");
            System.out.println("4. Вывести список товаров с ценой");
            System.out.println("5. Выход");
            System.out.print("Выберите действие: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (n) {
                case 1:
                    System.out.print("Введите название товара: ");
                    String productToAdd = scanner.nextLine();
                    ((HouseholdGoodsStore) baseStore).addProduct(productToAdd);
                    break;
                case 2:
                    System.out.print("Введите название товара для удаления: ");
                    String productToRemove = scanner.nextLine();
                    ((HouseholdGoodsStore) baseStore).removeProduct(productToRemove);
                    break;
                case 3:
                    baseStore.displayProducts();
                    break;
                case 4:
                    decoratedStore.displayProducts();
                    break;
                case 5:
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
