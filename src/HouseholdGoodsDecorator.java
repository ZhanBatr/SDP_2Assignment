class HouseholdGoodsDecorator implements HouseholdGoodsComponent {
    protected HouseholdGoodsComponent decoratedStore;

    public HouseholdGoodsDecorator(HouseholdGoodsComponent decoratedStore) {
        this.decoratedStore = decoratedStore;
    }

    @Override
    public void displayProducts() {
        decoratedStore.displayProducts();
    }
}
