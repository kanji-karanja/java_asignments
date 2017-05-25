import java.util.Scanner;
public class Water{
    static int control;
    public static void main(String args[]){
        System.out.println("Kisumu Water Company");
        System.out.println("====================");
        while(control==0){
        System.out.println("Hey customer!");
        intro();
        }
    }
    static void intro(){
        int typeOfCustomer=0;
        System.out.println("Please choose the type of customer you are:\n1. Metered\n2.Unmetered");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        try{
        typeOfCustomer = input.nextInt();
        System.out.println("\n");
        }
        catch(java.util.InputMismatchException e){
            System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Sorry! The input is invalid. Please put a number only");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\nTry here again:");
            typeOfCustomer = input2.nextInt();
            System.out.println("\n");

        }
        switch(typeOfCustomer){
            case 1:{metered();};break;
            case 2:{unmetered();};break;
            default:{
                System.out.println("Sorry! That is an invlaid Choice. Try again!");
                intro();
            };
        }

    }
   static void metered(){
    int typeOfMetered=0;
    System.out.println("Dear customer, what type of metered customer are you?");
    System.out.println("1.Normal Customer\n2.Industry customer");
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    try{
    typeOfMetered= input2.nextInt();
    }
    catch(java.util.InputMismatchException e){
           System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Sorry! The input is invalid. Please put a number only");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\nTry here again:");
            typeOfMetered = input.nextInt();
            System.out.println("\n");
         
    }
    switch(typeOfMetered){
        case 1:{normalMetered();};break;
        case 2:{industryMetered();};break;
        default:{
            System.out.println("Sorry! That is an invalid Choice. Try again!");
            metered();};
    }
    }
   static void unmetered(){
    int numOfUnits=0;
    double discount1,subtotal1;
    System.out.println("Please input the number of units you purchased:");
    Scanner input3 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    try{
    numOfUnits = input3.nextInt();
    }
    catch(java.util.InputMismatchException e){
          System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Sorry! The input is invalid. Please put a number only");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\nTry here again:");
            numOfUnits = input2.nextInt();
        
    }
    if(numOfUnits>0 && numOfUnits<150){
        subtotal1 = numOfUnits*33;
        if(numOfUnits>100){
            discount1=(double)subtotal1*8/100;
            subtotal1=subtotal1-discount1;
        }
    paymentUnmetered(subtotal1);
    }
    else if(numOfUnits>149){
        subtotal1=(149*33)+((numOfUnits-149)*30);
        discount1=(double)subtotal1*8/100;
        subtotal1=subtotal1-discount1;
    paymentUnmetered(subtotal1);
    }
    else{
        System.out.println("Sorry the number of units purchased is invalid");
        unmetered();
    }
    }
   static void normalMetered(){
    int numOfUnits=0;
    double discount1,subtotal1;
    System.out.println("Please input the number of units you purchased:");
    Scanner input3 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    try{
    numOfUnits = input3.nextInt(); 
    }
    catch(java.util.InputMismatchException e){
       System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Sorry! The input is invalid. Please put a number only");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\nTry here again:");
            numOfUnits = input2.nextInt();
    }
    if(numOfUnits>0 && numOfUnits<150){
        subtotal1 = numOfUnits*33;
        if(numOfUnits>100){
            discount1=(double)subtotal1*1/100;
            subtotal1=subtotal1-discount1;
            double discount2=(double)subtotal1*8/10;
            subtotal1=subtotal1-discount2;
        }
    paymentMetered(subtotal1);
    }
    else if(numOfUnits>149){
        subtotal1=(149*33)+((numOfUnits-149)*30);
        discount1=(double)subtotal1*1/100;
        subtotal1=subtotal1-discount1;
        double discount2=(double)subtotal1*8/10;
        subtotal1=subtotal1-discount2;
    paymentMetered(subtotal1);
    }
    else{
        System.out.println("Sorry the number of units purchased is invalid");
        unmetered();
    } 

    }
    static void industryMetered(){
    int units=2500;
    double subtotal1,discount1,discount2,discount3;
    subtotal1=(149*33)+((units-149)*30);
    discount1=(double)subtotal1*8/100;
        subtotal1=subtotal1-discount1;
        discount2=(double)subtotal1*1/10;
        subtotal1=subtotal1-discount2;
        discount3=discount2=(double)subtotal1*9/10;
        subtotal1=subtotal1-discount3;
    paymentMetered(subtotal1);
    }
    static void paymentMetered(double number){
    int paymentType=0;
    double discount4,receivedTotal=number,total;
    System.out.println("Howdy! How would you like to pay for your bill?");
    System.out.println("1.Electronically(Use of Credit Card\n2.Manually(cash)");
    Scanner input4 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    try{
    paymentType = input4.nextInt();
    }
    catch(java.util.InputMismatchException e){
         System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Sorry! The input is invalid. Please put a number only");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\nTry here again:");
            paymentType = input2.nextInt();
    }
    switch(paymentType){
        case 1:{
            discount4 = receivedTotal*5/100;
            total= receivedTotal-discount4;
            total = total +500;
            };break;
        case 2:{
            total=receivedTotal+500;
        };break;
        default:{
            System.out.println("Sorry the choice of payment is invalid");
            total=0;
        };
    } 
    System.out.println("Your total is "+total);
    continueControl();
    }
    static void paymentUnmetered(double number){
    int paymentType=0;
    double discount4,receivedTotal=number,total;
    System.out.println("Howdy! How would you like to pay for your bill?");
    System.out.println("1.Electronically(Use of Credit Card\n2.Manually(cash)");
    Scanner input4 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    try{
    paymentType = input4.nextInt();
    }
    catch(java.util.InputMismatchException e){
         System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Sorry! The input is invalid. Please put a number only");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\nTry here again:");
            paymentType = input2.nextInt();
    }
    switch(paymentType){
        case 1:{
            discount4 = receivedTotal*5/100;
            total= receivedTotal-discount4;
            };break;
        case 2:{
            total=receivedTotal;
        };break;
        default:{
            System.out.println("Sorry the choice of payment is invalid");
            paymentUnmetered(receivedTotal);
            total=0;
            };
    } 
    System.out.println("Your total is "+total);
    continueControl();
    }
    static void continueControl(){
    int controlUser;
    System.out.println("Do you want to continue?");
    System.out.println("1. Yes \n2. No");
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    try{
    controlUser = input.nextInt();
    }
    catch(java.util.InputMismatchException e){
        System.out.println("\nXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("Sorry! The input is invalid. Please put a number only");
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX\n\nTry here again:");
            controlUser = input2.nextInt();
    }
    switch(controlUser){
        case 1:{control=0;};break;
        case 2:{control=1;};break;
        default:{control=0;};break;
    
    }
    }
}