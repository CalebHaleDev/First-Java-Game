import java.sql.Time;
import java.util.ArrayList;
//import java.util.Date;
import java.util.Scanner; //used for inputs? new scanner = new Scanner(System.in)  then  = scanner.nextLine()   then after use, use scanner.close();
//print %s , variable to be substituted
//import java.time.LocalDateTime;  
//import java.time.format.DateTimeFormatter; 
import java.util.concurrent.TimeUnit;   //TimeUnit.SECONDS.sleep(1);
//import javax.swing.Timer;     
//import java.time.Clock
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.ActionEvent;  //for user inputs?

public class game {
  //for readability
  public static void println(Object x){   
    System.out.println(x);
  }
/*
  //TimeSpan datatype?
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

   

/*
 * if (gravityTime < now){
 * move blocks (if landed, create new faller)
 * check for rows
 * reset timer    gravityTime = now + 1.1-.1*difficulty sec
 * }
 * 
 * if (userTime < now){
 * shift if possible      user input
 *  if shift successful, reset timer    userTime = now + difficulty/10 sec
 * }
 * 
 * sleep 5+ milliseconds
 */



    Thread gravityThread = new Thread(){
      public void run(){
        //TimeUnit.SECONDS.sleep(1);
      //Thread.sleep(1000);
      println("gravity");
      }
    };
    gravityThread.start();

    //thread subclass method of threading, from website
    //gravityUpdate gravityThread = new gravityUpdate();
    //gravityThread.start();

    //custom running code can be put directly into the thread like this too:
    gravityUpdate gravitythread = new gravityUpdate(){
      public void run(){
        System.out.println("Gravity Thread Running");
      }
    };
    gravitythread.start();


    for(int i = 0; i<10; i++){
      println(now());
      //wait(1);
      try{
        Thread.sleep(1000);
        }catch(Exception e){
          println("sleep didn't work: exception e");
        }finally{
        }
      
     
    }
  }
}
