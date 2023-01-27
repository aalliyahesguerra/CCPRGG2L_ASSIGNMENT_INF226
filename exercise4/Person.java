public class Person {

    String Name;
    int Age;
    
    Person(String personName, int personAge) {
        this.Name = personName;
        this.Age = personAge;


    }

    
    
     void AddFriend(Person Friend) {
            System.out.println(this.Name + " is friends with " + Friend.Name);

    // this method accepts objects 
    }
    void addClassmate(Person Classmate) {
        System.out.println(this.Name+ " is classmates with " + Classmate.Name);
        

    }
}
