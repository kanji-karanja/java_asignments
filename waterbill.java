/* Code written by Karim K. Kanji
For more email: karimkanji101@gmail.com or whatsapp me on +254-703-756-325
*/
import java.util.*;
/*
water charges are as follows:
ksh. 33 per unit below 150 units
ksh. 30 per unit--150 units and above
*/
class Metered{
//pay a monthly fee of Ksh.500 for meter rent
//remove 10% discount from the principal amount
//all customers get 8% discount for Consumption of units above 100 units
//electronic card  get 5% discount of the total bill
//can pay either electronically or cash
//meter rent is charged seperately
Metered(){
int a=0;
int y,b=0,c,d,e,f,g,h,i,j,entry;
Scanner number = new Scanner(System.in);
System.out.println("\nPlease enter number of units to purchase:");
y= number.nextInt();
if(y>149){
a=((y-149)*30)+(149*33);
b=a*8/100;
}
else if(y<150){
a=y*33;
if(y<100){
b=0;
}
else if(y>=100){
b=a*8/100;
}
}
f=a-b;
c=f*10/100;
g=f-c;
//Discount for Consumption of units above 100(8%): \n Metered client discount(10%):
System.out.println("\nProvisional Bill\n=================================\nNumber of units: "+y+"\nDiscount for Consumption of units above 100(8%): Ksh."+b+"\nMetered client discount(10%): Ksh."+c+"\nTotal amount due: "+g+"\n=================================");
System.out.println("\nHow do you want to pay for your bill:\n1.Electronically(Using Visa card)\n2.Using Cash");
Scanner paytype = new Scanner(System.in);
entry = paytype.nextInt();
if(entry==1){
  d=g*5/100;
  h=g-d;
  i=h+500;
  System.out.println("\nYou have received a 5% discount. Your new bill is being processed.");
  System.out.println("\nFinal Bill\n=================================\nNumber of units: "+y+"\nDiscount for Consumption of units above 100(8%): Ksh."+b+"\nMetered client discount(10%): Ksh."+c+"\nAmount before electronic payment discount: Ksh."+g+"\nDiscount awarded for electronic payment(5%): Ksh."+d+"\nAmount after electronic payment discount: Ksh."+h+"\nMeter rent: Ksh.500\nTotal amount due: Ksh."+i+"\n=================================");
}
else if(entry==2){
  h=g+500;
  System.out.println("\nPlease wait as your full bill is being processed.");
  System.out.println("\nFinal Bill\n=================================\nNumber of units: "+y+"\nDiscount for Consumption of units above 100(8%): Ksh."+b+"\nMetered client discount(10%): Ksh."+c+"\nAmount after discount: Ksh."+g+"\nMeter rent: Ksh.500\nTotal amount due: Ksh."+h+"\n=================================");
}
System.out.println("\n\nꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏ");
System.out.println("           Thank you for using this system");
System.out.println("ꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏ\n\n");
System.out.println("NEXT CUSTOMER\n\n");
}

}
class Unmetered{
//all customers get 8% discount for Consumption of units above 100 units
//electronic card  get 5% discount of the total bill
//can pay either electronically or cash
Unmetered(){
  int a=0;
  int y,b=0,c,d,e,f,g=0,h,i,j,entry;
  Scanner number = new Scanner(System.in);
  System.out.println("\nPlease enter number of units to purchase:");
  y= number.nextInt();
  if(y>149){
  a=((y-149)*30)+(149*33);
  b=a*8/100;
  }
  else if(y<150){
  a=y*33;
  if(y<100){
  b=0;
  }
  else if(y>=100){
  b=a*8/100;
  }
  }
  f=a-b;
  //Discount for Consumption of units above 100(8%): \n Metered client discount(10%):
  System.out.println("\nProvisional Bill\n=================================\nNumber of units: "+y+"\nDiscount: Units above 100 (8%): Ksh."+b+"\nTotal amount due: "+f+"\n=================================");
  System.out.println("\nHow do you want to pay for your bill:\n1.Electronically(Using Visa card)\n2.Using Cash");
  Scanner paytype = new Scanner(System.in);
  entry = paytype.nextInt();
  if(entry==1){
    d=f*5/100;
    h=g-d;
    System.out.println("\nYou have received a 5% discount. Your new bill is being processed.");
    System.out.println("\nFinal Bill\n=================================\nNumber of units: "+y+"\nDiscount: Units above 100 (8%): Ksh."+b+"\nAmount before electronic payment discount: Ksh."+f+"\nDiscount awarded for electronic payment(5%): Ksh."+d+"\nTotal amount due: Ksh."+h+"\n=================================");
  }
  else if(entry==2){
    System.out.println("\nPlease wait as your full bill is being processed.");
    System.out.println("\nFinal Bill\n=================================\nNumber of units: "+y+"\nDiscount: Units above 100 (8%): Ksh."+b+"\nTotal amount due: Ksh."+f+"\n=================================");
  }
  System.out.println("\n\nꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏ");
  System.out.println("           Thank you for using this system");
  System.out.println("ꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏ\n\n");
  System.out.println("NEXT CUSTOMER\n\n");
}
}
class Industry{
int a,b,c,d,e,f,g,h,i,j;
int entry;
//fixed monthly Consumption of 2500 units
//metered client
//9% discount of total cost
//all customers get 8% discount for Consumption of units above 100 units
//electronic card  get 5% discount of the total bill
Industry(){
  a=((2500-149)*30+(149*33));
  b=a*8/100;
  f=a-b;
  c=f*10/100;
  g=f-c;
  d=g*9/100;
  h=g-d;
  System.out.println("\nProvisional Bill\n=================================\nNumber of units: 2500\nTotal amount due: "+h+"\n=================================");
  System.out.println("\nHow do you want to pay for your bill:\n1.Electronically(Using Visa card)\n2.Using Cash");
  Scanner paytype = new Scanner(System.in);
  entry = paytype.nextInt();
  if(entry==1){
    e=h*5/100;
    i=h-e;
    j=i+500;
    System.out.println("\nYou have received a 5% discount. Your new bill is being processed.");
    System.out.println("\nFinal Bill\n=================================\nNumber of units: 2500\nAmount before discount: Ksh."+h+"\nDiscount awarded: Ksh."+e+"\nAmount after discount: Ksh."+i+"\nMeter rent: Ksh.500\nTotal amount due: Ksh."+j+"\n=================================");
  }
  else if(entry==2){
    i=h+500;
    System.out.println("\nFinal Bill\n=================================\nNumber of units: 2500\nAmount before discount: Ksh."+h+"\nDiscount awarded: Ksh.0\nAmount after discount: Ksh."+h+"\nMeter rent: Ksh.500\nTotal amount due: Ksh."+i+"\n=================================");
  }
  System.out.println("\n\nꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏ");
  System.out.println("           Thank you for using this system");
  System.out.println("ꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏꝏ\n\n");
  System.out.println("NEXT CUSTOMER\n\n");
}
}
public class waterbill{

public static void main(String args[]){
//get type of user metered or unmetered
//if metered call objects from metered

//variables for storing inputs
int type_client, units_number2,control=1;
String isIndustry;

Scanner type = new Scanner(System.in);
//What you see when the program runs for the first time
System.out.println("\t\tKisumu water Company");
System.out.println("=======================================================");
System.out.println("Hello there,");
while(control==1){
System.out.println("To be served better please choose your category:\n1.Metered Customer\n2.Unmetered customer");
type_client = type.nextInt();
if(type_client==1){
  System.out.println("\nAre you an industry?(y/n)");
  Scanner input = new Scanner(System.in);
  isIndustry = input.nextLine();
  if(isIndustry.equals("y")){
    Industry myIndustry = new Industry();
  }
  else if(isIndustry.equals("n")){
    Metered myMetered = new Metered();
  }
}
else if(type_client==2){
  Unmetered myUnmetered = new Unmetered();
}
else{
  System.out.println("\nSorry that is an incorrect entry. Try again!\n");
}
}
}
}
/* Code written by Karim K. Kanji
For more email: karimkanji101@gmail.com or whatsapp me on +254-703-756-325
*/
