package org.example;

public class Main {
    public static void main(String[] args) {
        ShoppingCard card = new ShoppingCard();
        Item itemOne = new Item("12", 10);
        Item itemTwo = new Item("34", 30);
        card.addItem(itemOne);
        card.addItem(itemTwo);
        card.pay(new PaypalStrategy("email@example.com", "password"));
        card.pay(new CreditCardStrategy("Yusuf Demiroz", "1234567890", "123", "01/30"));
    }
}