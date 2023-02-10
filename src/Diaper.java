import javax.sound.sampled.SourceDataLine;
import javax.swing.event.SwingPropertyChangeSupport;

public class Diaper extends GroceryItem {

// extends GroceryItem = inheritance from GroceryItem

    public void showItemName() {
    System.out.println (this.name + " : diaper");
    
    }
}
