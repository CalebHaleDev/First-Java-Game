
import java.util.ArrayList;

//for keypress events
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;

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


  public static void main(String[] args){

    int level = 1;
    //elementBlock[3][10] gameGrid = {new elementBlock(0)};

    while(level>0){
      //main game loop
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
    }


    
   gameFrame frame = new gameFrame();

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
     frame.add(square);

     
     //these are used for background color of label, everywhere by default
     square.setBackground(new Color(100, 100, 255));
     square.setOpaque(true);

     JPanel gamePanel = new JPanel();
     gamePanel.setBackground(new Color(100, 50, 1));
     gamePanel.setBounds(30, 30, 250, 350);
     gamePanel.add(square);
     gamePanel.setLayout(null);
     frame.add(gamePanel);


     JButton restartButton = new JButton();
     //in a class for the frame, within the constructor, use restartButton.addActionListener(e -> //whatever it should do); for a restart button
     //restartButton.setFocusable(false)
     

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

