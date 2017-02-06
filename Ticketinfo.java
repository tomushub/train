//ticket info
import java.io.*;
import java.lang.*;

public class Ticketinfo{
 String direction;
 int fare;
 String type;
 String message;
 String message2;

  public String getTicket(){
    message = direction + "行きの" + type + "の切符です。";
    return message;
  }
  public String getFare(){
    message2 = fare + "円";
    return message2;
  }

}
