public class App {
    public static void main(String[] args) throws Exception {

        //objects
        Person Me = new Person ("Liyah",19);
        Person Friend = new Person ("Kitkat",19);
        
        Me.AddFriend(Friend);

        //composition 
        Pet Dog = new Pet("Chim", 6, Me);
        Dog.showOwner();

        Person Classmate = new Person ("Bia", 19);
        Person Classmate2 = new Person ("Jini",19);
        Person Classmate3 = new Person ("Jeanne",19);

        //aggregation
        Me.addClassmate(Classmate); 
        Me.addClassmate(Classmate2);
        Me.addClassmate(Classmate3);

        //car
        Car Jeepney = new Car("Jeep Wrangler" , "Black", Me);
        Jeepney.myCar();

    }
   
}
