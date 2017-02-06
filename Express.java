//Expressticket.java
import java.io.*;
import java.lang.*;

public class Express extends Ticketinfo{
  int seat;
  String message2;
  public String getFare(){
    fare = fare + seat;
    message2 = fare + "円";
    return message2;
  }
}
