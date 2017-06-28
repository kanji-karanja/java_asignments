import java.util.Random;
import java.util.Scanner;
public class Sudoku{
    public static void main(String[] args) {
        int[] row1=new int[9];
        int[] row2=new int[9];
        int[] row3=new int[9];
        int[] row4=new int[9];
        int[] row5=new int[9];
        int[] row6=new int[9];
        int[] row7=new int[9];
        int[] row8=new int[9];
        int[] row9=new int[9];
        Random mySol = new Random();
        for(int i=0; i<9;i++){
            row1[i]=mySol.nextInt(9)+1;
            row2[i]=mySol.nextInt(9)+1; 
            row3[i]=mySol.nextInt(9)+1; 
            row4[i]=mySol.nextInt(9)+1; 
            row5[i]=mySol.nextInt(9)+1; 
            row6[i]=mySol.nextInt(9)+1; 
            row7[i]=mySol.nextInt(9)+1; 
            row8[i]=mySol.nextInt(9)+1; 
            row9[i]=mySol.nextInt(9)+1; 
        }
    System.out.println("\n");
    for(int i=0; i<9;i++){
        System.out.print(row1[i]+" ");
    }System.out.print("\n");
     for(int i=0; i<9;i++){
        System.out.print(row2[i]+" ");
    }System.out.print("\n");
     for(int i=0; i<9;i++){
        System.out.print(row3[i]+" ");
    } System.out.print("\n");
     for(int i=0; i<9;i++){
        System.out.print(row4[i]+" ");
    } System.out.print("\n");
     for(int i=0; i<9;i++){
        System.out.print(row5[i]+" ");
    } System.out.print("\n");
     for(int i=0; i<9;i++){
        System.out.print(row6[i]+" ");
    } System.out.print("\n");
     for(int i=0; i<9;i++){
        System.out.print(row7[i]+" ");
    } System.out.print("\n");
     for(int i=0; i<9;i++){
        System.out.print(row8[i]+" ");
    } System.out.print("\n");
     for(int i=0; i<9;i++){
        System.out.print(row9[i]+" ");
        }
    System.out.println("\n");
    }
}