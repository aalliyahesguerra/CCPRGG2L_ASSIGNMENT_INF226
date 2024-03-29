import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class TryAgain extends JFrame{
    TryAgain(){
        JLabel label = new JLabel();
        label.setText("GAME OVER");
        label.setFont(new Font("Courier New", Font.BOLD, 50));
        this.add(label);
         // JLabel
        JLabel imageLabel = new JLabel();
        ImageIcon yasImage = new ImageIcon("yas.jpg");
        imageLabel.setIcon(yasImage);
        // Add image to frame
        this.add(imageLabel);

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Try Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));

        EventHandler handler = new EventHandler();
        tryAgainButton.addActionListener(handler);
        // Add button to frame
        this.add( tryAgainButton);

        //EXIT BUTTON
        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));

        EventHandler1 handler1 = new EventHandler1();
        exitButton.addActionListener(handler1);
        // Add button to frame
        this.add(exitButton);

        this.add(tryAgainButton);
        this.add(exitButton);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1100,850);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        // set background color of frame
        this.getContentPane().setBackground(new Color(178, 229, 190));
        // lock frame
        this.setResizable(false);
    }

    private class EventHandler implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            
            // open game frame
            new GameFrame();
            // Close main menu frame
            dispose();
        
        }

    }
    private class EventHandler1 implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            
            // Close main menu frame
            dispose();
        }

    }
}

