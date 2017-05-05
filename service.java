import java.util.*;
import java.text.*;
public class service{
  public static void main(String[] args) {
    menu1();
    choiceafter();
  }
  static void menu1(){
    System.out.println("Equitel self care menu");
    System.out.println("======================");
    System.out.println("1.Balance inquiry\n2.Tarrif plan\n3.Buy bundles\n4.Gawa credo\n5.Settings/help\n6.Exit\n");
  }
  static void choiceafter(){
    int choice=0,choice1=0;
    Scanner input = new Scanner(System.in);
    choice = input.nextInt();
    Date today = new Date();
    SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy hh:mm");
    	String date=ft.format(today);
    if(choice==1){
      System.out.println("\nYour airtime balance on "+date+" Ksh.0.95 & data bundle is 39.42 MB. Get a smartphone at Ksh.2,167 per month for 1 year in select Equity Branches");
    }
    else if(choice==2){
      System.out.println("\nEquitel self care menu");
      System.out.println("======================");
      System.out.println("1.View my tarrif plan\n2.View my options\n3.Back\n");
      choice1 = input.nextInt();
      if(choice1==3){
        menu1();
        choiceafter();
      }
    }
    else if(choice==6){
      System.out.println("Thank you for staying connected with Equitel");
    }
    else{
      System.out.println("Invalid option");
      menu1();
      choiceafter();
    }
  }
}
