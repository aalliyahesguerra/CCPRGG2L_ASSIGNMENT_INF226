public class App {
    
    public static void main (String[] args) {

        Person me = new Person() ;
        //System.out.println(me.name);

        //
        me.setName("Aalliyah Sunshine");

        System.out.println(me.getName());

        //daughter object
        Daughter myself = new Daughter();

        System.out.println(myself.surname);

        myself.showSurname();
    }
}
