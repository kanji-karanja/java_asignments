import java.util.*;
public class RandGenerator{
    public static void main(String args[]){
        Random num =new Random();
        for(int i=0;i<10;i++){
            System.out.println(num.nextInt(9-1+1)+1);
        }
    }
}