public class Character {
    String name;
    int damage;    
    String rarity;

    void Name() {
        System.out.println("Name: " + name);
    }
    void Damage() {
        System.out.println("Damage: " + damage);
    }
    void Rarity() {
        System.out.println("Rarity: " + rarity);
    }
    void attack() {
        System.out.println(name + " is attacking!");
    }
    void addDamage(int additionaldamage) {
        int newDamage = this.damage + additionaldamage;
        System.out.println(additionaldamage + " Damage has been added to " + name );
        System.out.println( name + "'s damage increased to: " + (newDamage));
        
        this.damage = newDamage;
    }
    String showNameandRarity() {
        return "Name: " + name + "\n" + "Rarity: " + rarity;
        
    }
        

    }
   
    
