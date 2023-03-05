import java.util.ArrayList;
import java.util.Random;

//for keypress events
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.JButton;
//for screen display
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Dimension;
//import javax.swing.SwingUtilities;
//for background color
import java.awt.Color;

public class game {
  public static void println(Object x){   //for readability
    System.out.println(x);
  }
  public static Object now(){
    return java.time.Clock.systemUTC().instant();
  }
  public static void createGrid(int width, int height){
    elementBlock[][] gameGrid = new elementBlock[width][height];
    Random rand = new Random();
    for(int i=0;i<3;i++){
      for(int j=0;j<10;j++){
        //int atomicNum = rand.nextInt(8);
        //int charge = rand.nextInt(atomicNum); //?
        gameGrid[i][j] = new elementBlock(0, 0);
        //gameGrid[i][j] = new elementBlock(atomicNum, charge);
      }
    }
  }

  public static void main(String[] args){

    int level = 1;
    createGrid(3, 10);

    //gameFrame frame = new gameFrame();
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
     myJFrame.setSize(new Dimension(500, 700));
     myJFrame.setResizable(false);
     //myJFrame.setMinimumSize(new Dimension(700, 700));
     myJFrame.setTitle("Game window");
     myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this makes the window close, not just hide when exitted
     //myJFrame.getContentPane().setBackground(new Color(100,100,100));
     //myJFrame.setLayout(null);  //allows custom label settings like size

     Border squareBorder = BorderFactory.createLineBorder(Color.blue, 2);
     JLabel square = new JLabel();
     //ImageIcon element = new ImageIcon(path);
     square.setIcon(null);
     square.setBounds(35,35,35,35);
     square.setBorder(squareBorder);
     //text
     square.setText("hello world");
     //square.setHorizontalTextPosition(JLabel.RIGHT);
     //square.setVerticalTextPosition(JLabel.TOP);
     //square.setText(null);  //might be useful for font and *size*
     //image
     //square.setHorizontalAlignment(JLabel.LEFT);
     //square.setVerticalAlignment(JLabel.BOTTOM);
     square.setForeground(new Color(10, 50, 100));    //used to change text color
     square.setIconTextGap(-5);
     myJFrame.add(square);
     //these are used for background color of label, everywhere by default
     square.setBackground(new Color(100, 100, 255));
     square.setOpaque(true);

     JPanel gamePanel = new JPanel();
     gamePanel.setBackground(new Color(100, 50, 1));
     gamePanel.setBounds(30, 30, 250, 350);
     gamePanel.add(square);
     gamePanel.setLayout(null);
     myJFrame.add(gamePanel);

     JButton restartButton = new JButton(){
      
     };
     myJFrame.add(restartButton);
     restartButton.addActionListener(e -> level=0);
     //in a class for the frame, within the constructor, use restartButton.addActionListener(e -> //whatever it should do); for a restart button
     //restartButton.setFocusable(false)


   // while(level>0){
      //main game loop
/*
 * if (gravityTime < now){
 * move blocks (if landed, create new faller)   //if landed in the first row, end game (level = 0)
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
  //  }
     

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
