public class Car {
    //dependent to object : Me

    String Brand;
    String Color;
    Person Owner;

    Car(String carBrand, String carColor, Person OwnerName) {
        this.Brand = carBrand;
        this.Color = carColor;
        this.Owner = OwnerName;

    }
    void myCar() {
        System.out.println(Owner.Name +"'s car is a " + this.Color + " " + this.Brand);
    }

    
}
