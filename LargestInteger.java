import java.util.Scanner;
public class LargestInteger{
  public static void main(String args[]){
    int numObjects,max=0,counter=1,input;
    Scanner object = new Scanner(System.in);
    System.out.println("How many integers do you want to get the largest?");
    numObjects = object.nextInt();
    while(counter<=numObjects){
    input = object.nextInt();
    if(input>max){
    max=input;
    ++counter;
    }
    else{
      ++counter;
    }
  }
  System.out.println("The largest integer is: "+max);
}
}
