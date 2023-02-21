import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner; //used for inputs? new scanner = new Scanner(System.in)  then  = scanner.nextLine()   then after use, use scanner.close();
//print %s , variable to be substituted
import java.time.LocalDateTime;  
import java.time.format.DateTimeFormatter; 
import java.util.concurrent.TimeUnit;   //TimeUnit.SECONDS.sleep(1);
import javax.swing.Timer;     
import java.awt.Image;
import java.awt.Graphics;
import java.awt.event.ActionEvent;  //for user inputs?

public class game {
  public static void main(String[] args) {
    String name = "user";
    System.out.println("Hello "+name);
    
private Timer timer;

    for(int i = 0; i<10; i++){
      System.out.println(java.time.Clock.systemUTC().instant());
      TimeUnit.SECONDS.sleep(1);
      Thread.sleep(1000);
      
    }
  }
}

/*
try{

}catch(){

}
*/