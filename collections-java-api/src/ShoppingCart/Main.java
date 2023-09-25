package ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart carrinho1 = new ShoppingCart();

        carrinho1.addItem("Banana", 5.99f, 1);
        carrinho1.addItem("leite", 4.5f, 6);
        carrinho1.addItem("queijo", 55.5f, 1);
        carrinho1.addItem("pamonha", 11.5f, 5);

        System.out.println("Valor total: " + String.format("%.2f", carrinho1.getTotalPrice())); 
    }
}
