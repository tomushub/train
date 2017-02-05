//main.java
import java.io.*;
import java.lang.*;

public class TicketManage{
  public static void main(String[] args){
    Ticketinfo info[] = new Ticketinfo[5];

    info[0] = new Ticketinfo();
    info[0].direction = "横浜";
    info[0].fare = 300;
    info[0].type = "自由席";

    Express exp = new Express();
    exp.direction = "京都駅";
    exp.seat = 100;
    exp.fare = 1000;
    exp.type = "指定席";
    info[1] = exp;

    info[2] = new Ticketinfo();
    info[2].direction = "仙台駅";
    info[2].fare = 800;
    info[2].type = "自由席";

    exp = new Express();
    exp.direction = "大阪駅";
    exp.seat = 200;
    exp.fare = 1000;
    exp.type = "指定席";
    info[3] = exp;

    info[4] = new Ticketinfo();
    info[4].direction = "静岡駅";
    info[4].fare = 400;
    info[4].type = "自由席";

    int i;
    for(i = 0; i<5; i++){
        System.out.println(info[i].getTicket());
        System.out.println(info[i].getFare());
    }
  }
}
