//Expressticket.java
import java.io.*;
import java.lang.*;

public class Express extends Ticketinfo{
  int seat;
  public int getFare(){
    fare = fare + seat;
    return fare;
  }
}
