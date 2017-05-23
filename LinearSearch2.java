import java.util.Scanner;
public class LinearSearch2{
  public static void main(String args[]){
    int counter=0,total,position=0;
    String searched,current;
    Scanner object = new Scanner(System.in);
    System.out.println("Please enter the word to search");
    searched = object.nextLine();
    System.out.println("Enter the number of words to search");
    total = object.nextInt();
    System.out.println("Enter the words to search");
    while(counter<=total){
    current = object.nextLine();
    if(searched.equals(current)){
    position=counter;
    ++counter;
    }
    else{
    ++counter;
    }
    }
    System.out.println("The word is in position: "+position);
  }
}
