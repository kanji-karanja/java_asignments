import java.util.Random;
import java.util.Scanner;
public class arcade{
  public static void main(String args[]){
    int rating;
    double coupons,bars=0,drops,getdrops;
    double answer;
    Random rand= new Random();
    rating = rand.nextInt(10);
    switch(rating){
      case 0:{coupons= 17;};break;
      case 1:{coupons= 34;};break;
      case 2:{coupons= 78;};break;
      case 3:{coupons= 99;};break;
      case 4:{coupons= 102;};break;
      case 5:{coupons= 125;};break;
      case 6:{coupons= 168;};break;
      case 7:{coupons= 198;};break;
      case 8:{coupons= 203;};break;
      case 9:{coupons= 277;};break;
      default: coupons = 0;
    }
    System.out.println("----------------------------------");
    System.out.println("||||||||||||||||||||||||||||||||||");
    System.out.println("----------------------------------");
    System.out.println("     ARCADE COUPONS AND PRIZES    ");
    System.out.println("----------------------------------");
    System.out.println("||||||||||||||||||||||||||||||||||");
    System.out.println("----------------------------------");
    System.out.println("This is your rating: "+rating+"\nYour have won the following number of coupons: "+coupons);
    while(coupons>3){
      while((coupons/10)>=1){
        answer=(coupons/10);
        bars= Math.floor(answer);
        coupons=coupons-(bars*10);
        getdrops=coupons/3;
        drops = Math.floor(getdrops);
        coupons=coupons-(drops*3);
        System.out.println("Number of Candy bars won: "+bars);
        System.out.println("Number of Gum drops won: "+drops);
      }
    }
  }
}
