package entity;

public class SaleslistDetaisl {
    private Items items;
    private int quantity;

    public SaleslistDetaisl(Items items, int quantity) {
        this.items = items;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SaleslistDetaisl{" +
                "items=" + items +
                ", quantity=" + quantity +
                '}';
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
