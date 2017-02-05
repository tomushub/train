//ticket info
import java.io.*;
import java.lang.*;

public class Ticketinfo{
 String direction;
 int fare;
 String type;
 String message;

  public String getTicket(){
    message = direction + "行きの" + type + "の切符です。";
    return message;
  }
  public int getFare(){
    return fare;
  }

}
