import java.util.Scanner;
public class cuboid{
  public static void main(String args[]){
    int answer_sa;
    System.out.println("Cuboid Surface Area and Volume Calculator");
    System.out.println("=========================================");
    answer_sa = surfacearea();
    System.out.println("The Surface area is: "+answer_sa);

    System.out.println("==================================");
    System.out.println("Coded by hand. Crafted by Cryosoft");
    System.out.println("==================================");

  }
  static int surfacearea(){
    int len, wid, hei, sa,vol;
        Scanner input = new Scanner(System.in);
    System.out.println("\nFinds the Surface Area and Volume of a Cuboid");
    System.out.println("\nPlease enter the length:");
    len = input.nextInt();
    System.out.println("Please enter the width:");
    wid = input.nextInt();
    System.out.println("Please enter the height:");
    hei = input.nextInt();
    sa = ((len*wid)*2)+((len*hei)*2)+((wid*hei)*2);
    vol= volume(len, wid,hei);
    System.out.println("\nThe volume is: "+vol);
    return sa;
  }
  static int volume(int length, int width, int height){
    int volume;
    volume= length*width*height;
    return volume;
  }
}
