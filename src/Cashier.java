public class Cashier {
    
    public void checkOut(GroceryItem item)  {
        // this method can accept any form 
        System.out.println("You have purchased " + item.name);
    }

    public void showItemPrice(GroceryItem item) {
        System.out.println(item.name + " : P" + item.price);
    }
}
