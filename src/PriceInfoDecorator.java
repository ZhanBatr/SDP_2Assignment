class PriceInfoDecorator implements HouseholdGoodsComponent {
    private HouseholdGoodsComponent decoratedStore;

    public PriceInfoDecorator(HouseholdGoodsComponent decoratedStore) {
        this.decoratedStore = decoratedStore;
    }

    @Override
    public void displayProducts() {
        decoratedStore.displayProducts();
        System.out.println("Дополнительная информация: Цена каждого товара.");
    }
}
