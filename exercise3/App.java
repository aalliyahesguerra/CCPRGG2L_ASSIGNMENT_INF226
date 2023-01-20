public class App {
    public static void main(String[] args) {

        Character sword = new Character();

        sword.name = "Wakizashi";
        sword.damage = 8;
        sword.rarity ="Legendary";
        System.out.println(sword.showNameandRarity()); 
        sword.Damage();
        sword.attack();
        sword.addDamage(10);
        sword.addDamage(5);
        


        Character crossbow = new Character();
        crossbow.name = "Grastaphete";
        crossbow.damage = 6;
        crossbow.rarity ="Rare";


        Character pole = new Character();
        pole.name = "Polearm";
        pole.damage = 4;
        pole.rarity ="Rare";
        
    }
}