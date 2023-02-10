public class App {
    public static void main(String[] args) throws Exception {
    
    System.out.println("----GROCERY STORE---- \n");
    //item in form of a diaper 
    //polymorphic variable
    
    System.out.println("--ITEMS AVAILABLE--");
    GroceryItem item1 = new Diaper();
    item1.name = "Huggies";
    item1.showItemName();

    GroceryItem item2 = new Milk();
    item2.name = "Bearbrand";
    item2.showItemName();
    System.out.println();

    System.out.println("--ITEM PRICE--");
    
    Cashier c1 = new Cashier();
    item1.price = 899;
    item2.price = 289;
    c1.showItemPrice(item1);
    c1.showItemPrice(item2);
    System.out.println();

    System.out.println("--CHECKOUT--");
    c1.checkOut(item1);
    c1.checkOut(item2);

    System.out.println("---RECEIPT---");
    GroceryItem [] itemArray = new GroceryItem[2];

    itemArray[0] =item1;
    itemArray[1] = item2;
    
    double totalAmount = 0.00;

    for (int i = 0; i < itemArray.length; i++) {
        itemArray[i].showItemName();
        System.out.println(itemArray[i].price);
        totalAmount +=itemArray[i].price;

        //totalAmount = totalAmount + itemArray[i].price
        
        }
        System.out.println("Total Amount is " + totalAmount + "\n");

        Dog mydog = new Dog();
        mydog.eat();


    }

}