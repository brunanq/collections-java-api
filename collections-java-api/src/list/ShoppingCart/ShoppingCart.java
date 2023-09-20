package list.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(String name, float price, int amount){
      Item item = new Item(name, price, amount);
      items.add(item);
    }

    public void removeItem(int index){
        items.remove(index);
    }

    public float getTotalPrice(){
        float total = 0;
        for (Item item : items) {
            total = total + (item.getPrice() * item.getAmount());
        }
        return total;
    }

}
