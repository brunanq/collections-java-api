package list.ShoppingCart;

public class Item {
    private String name;
    private float price;
    private int amount;

    public Item(String name, float price, int amount){
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }
}

