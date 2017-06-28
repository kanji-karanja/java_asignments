import java.util.*;
public class BubbleSort{
public static void main(String[] args) {
    int controller;
    Scanner input = new Scanner(System.in);
    System.out.println("How many values do you want to sort?");
    controller = input.nextInt();
    int[] values = new int[controller];
    int[] sorted = new int[controller];
    System.out.println("Input values here:");
    for(int i = 0; i < controller;i++){
    values[i]=input.nextInt();
    }
    int smallest = values[0];
    for(int j=0;j<controller;j++){
    for(int i = 0; i<controller-1;i++){
        if(values[i]>values[i+1]){
            int temp =values[i];
            values[i]= values[i+1];
            values[i+1]=temp;
        }
    }
    }
    System.out.println("/nSorted is as follows:");
    for(int i= 0;i<controller; i++){
    System.out.print(values[i]+" ");
    }
System.out.println("");
    
}
}