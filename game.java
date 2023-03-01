import java.sql.Time;
import java.util.ArrayList;
//import java.util.Date;
import java.util.Scanner; //used for inputs? new scanner = new Scanner(System.in)  then  = scanner.nextLine()   then after use, use scanner.close();
//import java.time.LocalDateTime;  
   
//import java.time.Clock;
import java.awt.Image;
import java.awt.Graphics;

//for keypress events
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
//for screen display
import javax.swing.JFrame;
import java.awt.Dimension;
//import javax.swing.SwingUtilities;
//for background color
import java.awt.Color;

public class game {
  //for readability
  public static void println(Object x){   
    System.out.println(x);
  }

  public static Object now(){
    return java.time.Clock.systemUTC().instant();
  }

  public static void updateScreen(){
    //idk how to do visuals
  }

/*
 * if (gravityTime < now){
 * move blocks (if landed, create new faller)
 * check for rows
 * reset timer    gravityTime = now + 1.1-.1*difficulty sec
 * }
 * 
 * if (userTime < now){
 * shift if possible      user input
 *  if shift successful, reset timer    userTime = now + difficulty/20 sec
 * }
 * 
 * sleep 5+ milliseconds
 */
  public static void main(String[] args){
//throws Exception
   
     JFrame myJFrame = new JFrame();
 
     myJFrame.addKeyListener(new KeyAdapter() {
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
 
     myJFrame.setVisible(true);
     myJFrame.setSize(new Dimension(900, 800));
     myJFrame.setResizable(false);
     //myJFrame.setMinimumSize(new Dimension(700, 700));
     myJFrame.setTitle("Game window");
     myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this makes the window close, not just hide when exitted
     //ImageIcon image = new ImageIcon(file name or path for logo)    //creates an image icon
     //myJFrame.setIconImage(image.getImage());   //puts an image on the logo spot on the frame
     myJFrame.getContentPane().setBackground(new Color(100,100,100));
     

     for(int i = 0; i<10; i++){
      println(now());
      try{
        Thread.sleep(1000);
        }catch(Exception e){
          println("sleep didn't work: exception e");
        }finally{
        }
    }
  }
}

