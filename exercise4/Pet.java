public class Pet {

    // attributes
    String Name;
    int Age;
    Person owner;

    Pet(String petName, int petAge, Person ownerName) {
        this.Name = petName;
        this.Age = petAge;
        this.owner = ownerName;
    
    }
    void showOwner() {
        System.out.println("My name is " + this.Name + ". My owner name is " + owner.Name);
    }

}