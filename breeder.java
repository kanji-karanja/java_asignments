import java.util.Scanner;
public class breeder{
  public static void main(String args[]){
    String day;
    Scanner input= new Scanner(System.in);
    System.out.println("Breeder's Task List");
    System.out.println("===================");
    System.out.println("Please input the day to reveal task to be done\n");
    day = input.nextLine();
    System.out.println("\nTask to be done");
    System.out.println("---------------");

    switch(day){
      case "Monday":{
        System.out.println("\nGive two litres of mixed herbs");
      };break;
      case "Tuesday":{
        System.out.println("\nSpray animal with pesticide");
      };break;
      case "Wednesday":{
        System.out.println("\nGive two blocks of salt");
      };break;
      case "Thursday":{
        System.out.println("\nInject animal with medicine");
      };break;
      case "Friday":{
        System.out.println("\nTest urine samples");
      };break;
      default:
      System.out.println("\nThe day is invalid. Now exiting program");
    }
    System.out.println("\n==================================");
    System.out.println("Coded by hand, Crafted by Cryosoft");
    System.out.println("==================================");
  }
}
