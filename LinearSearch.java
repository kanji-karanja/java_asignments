import java.util.Scanner;
public class LinearSearch{
  public static void main(String args[]){
    int counter=1,total,position=0,searched,current;
    Scanner object = new Scanner(System.in);
    System.out.println("Please enter the number to search");
    searched = object.nextInt();
    System.out.println("Enter the number of integers to search");
    total = object.nextInt();
    System.out.println("Enter the numbers to search");
    while(counter<=total){
    current = object.nextInt();
    if(searched==current){
    position=counter;
    ++counter;
    }
    else{
    ++counter;
    }
    }
    System.out.println("The number is in position: "+position);
  }
}
