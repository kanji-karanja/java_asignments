import java.util.Scanner;
public class fuel_calc{
  public static void main(String args[]){
    int dist, price, rate, cost, tfuel;
    Scanner input = new Scanner(System.in);
    System.out.println("---------------------------");
    System.out.println("Fuel Consumption Calculator");
    System.out.println("---------------------------");
    System.out.println("Please input the distance of travel in miles:");
    dist= input.nextInt();
    System.out.println("Please input the rate of fuel Consumption in gallons per mile:");
    rate= input.nextInt();
    System.out.println("Please input price of fuel in dollars per gallon:");
    price= input.nextInt();
    tfuel=rate*dist;
    cost=tfuel*price;
    System.out.println("Your Total fuel cost for the commute is: "+cost+" Dollars");
  }
}
