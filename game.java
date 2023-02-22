import java.sql.Time;
import java.util.ArrayList;
//import java.util.Date;
import java.util.Scanner; //used for inputs? new scanner = new Scanner(System.in)  then  = scanner.nextLine()   then after use, use scanner.close();
//print %s , variable to be substituted
//import java.time.LocalDateTime;  
//import java.time.format.DateTimeFormatter; 
//import java.util.concurrent.TimeUnit;   //TimeUnit.SECONDS.sleep(1);
//import javax.swing.Timer;     
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.ActionEvent;  //for user inputs?

public class game {
  //for readability
  public static void println(Object x){   
    System.out.println(x);
  }
/*
  public static void wait(double seconds){
    try{
      Thread.sleep(Double.valueOf(1000*seconds).longValue());
      }catch(Exception e){
        println("sleep didn't work: exception e");
      }finally{
      }
  }
*/
  public static Object now(){
    return java.time.Clock.systemUTC().instant();
  }

  public static void updateScreen(){
    //idk how to do visuals
  }

  public static void main(String[] args) {

    /*main update loop
    wait 1 second (or 1.1-.1*difficulty), move mobile block down, if landed spawn another, check for and remove valid rows.
    run screen update

    main user input loop
    wait until key pressed, if possible: move mobile block and wait .25 or .5 seconds, or difficulty/10 seconds
    run screen update
    */

    for(int i = 0; i<10; i++){
      println(now());
      //wait(1);
      Thread.sleep(1000);
     
    }
  }
}
