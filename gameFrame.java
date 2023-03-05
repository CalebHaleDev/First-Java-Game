import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class gameFrame extends JFrame /*implements KeyListener*/{
 
  this.addKeyListener(new KeyAdapter() {
    public void keyPressed(KeyEvent e) {
         int keyCode = e.getKeyCode();
         if (keyCode == KeyEvent.VK_UP) {
           System.out.println("Up Arrow-Key is pressed!");
         }
         else if (keyCode == KeyEvent.VK_DOWN) {
           System.out.println("Down Arrow-Key is pressed!");
         }
         else if (keyCode == KeyEvent.VK_LEFT) {
           System.out.println("Left Arrow-Key is pressed!");
         }
         else if (keyCode == KeyEvent.VK_RIGHT) {
         System.out.println("Right Arrow-Key is pressed!");
         }
       }
     });
 
     this.setVisible(true);
     this.setSize(new Dimension(500, 700));
     this.setResizable(false);
     //myJFrame.setMinimumSize(new Dimension(700, 700));
     this.setTitle("Game window");
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this makes the window close, not just hide when exitted
     //ImageIcon image = new ImageIcon(file name or path for logo)    //creates an image icon
     //myJFrame.setIconImage(image.getImage());   //puts an image on the logo spot on the frame
     //myJFrame.getContentPane().setBackground(new Color(100,100,100));
     //myJFrame.setLayout(null);  //allows custom label settings like size

}
