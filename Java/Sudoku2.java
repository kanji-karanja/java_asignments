import java.util.*;
public class Sudoku2{
    public static void main(String [] args){
        Random num = new Random();
        int[] row1=new int[9];
        for(int j=0;j<9;j++){
        row1[j]=num.nextInt(9)+1;
        }
        int a,b,c,d, e, f,g,h,k;
        a=num.nextInt(9)+1;
        b=num.nextInt(9)+1;
        c=num.nextInt(9)+1;
        d=num.nextInt(9)+1;
        e=num.nextInt(9)+1;
        f=num.nextInt(9)+1;
        g=num.nextInt(9)+1;
        h=num.nextInt(9)+1;
        k=num.nextInt(9)+1;
        for(int i=0;i<8;i++){
        if(!(row1[i]==row1[i+1])){
              for(int j=0;j<8;j++){
            if(!(row1[j]==row1[j+1])){
              for(int l=0;l<8;l++){
                if(!(row1[l]==row1[l+1])){
                     for(int m=0;m<8;m++){
                        if(row1[m]==row1[m+1]){
                             row1[m]=num.nextInt(9)+1;
                                            }
                                        }
                                 }
                                  else{
            row1[l]=num.nextInt(9)+1;
                                  }
                            }
        }
         else{
            row1[j]=num.nextInt(9)+1;
         }
        }
        }
        else{
            row1[i]=num.nextInt(9)+1;
        }
        }
        for(int i=0;i<8;i++){
            System.out.print(row1[i]+" ");
        }

    }
}