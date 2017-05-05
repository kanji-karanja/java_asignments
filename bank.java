import java.util.Scanner;
public class bank{
  static int choice_counter=0;
  static String name,acctype;
  static int accno,bal,deposit;
  public static void main(String args[]){
  mainmenu();
}
  static void init(){

  Scanner input = new Scanner(System.in);
  Scanner input2 = new Scanner(System.in);
  System.out.println("\nPlease Enter name of account holder: ");
  name = input.nextLine();
  System.out.println("Please input account number: ");
  accno = input.nextInt();
  System.out.println("Please input an account type: ");
  acctype = input2.nextLine();
  System.out.println("Please input account balance: ");
  bal = input.nextInt();
  System.out.println("\n===============");
  System.out.println("Account Details");
  System.out.println("===============");
  System.out.println("Client name: "+name+"\nAccount Number: "+accno+"\nAccount type: "+acctype+"\nAccount Balance: "+bal+"\n");
  ++choice_counter;
  mainmenu();
  }
  static void depo(){
    String choicedepo;
    System.out.println("\nInput amount to be Deposited:");
    Scanner input = new Scanner(System.in);
    deposit = input.nextInt();
    System.out.println("Are you sure you want to deposit Ksh."+deposit+" ? (y for yes and n for no)");
    Scanner input2 = new Scanner(System.in);
    choicedepo = input2.nextLine();
    if(choicedepo.equals("y")){
      bal=bal+deposit;
      System.out.println("\nSuccess!\nNew balance is: Ksh."+bal+"\n");
      mainmenu();
    }
    else{
    System.out.println("Cancelling deposit\n");
    mainmenu();
  }
  }
  static void withdraw(){
    String withdraw_choice;
    int amnt_withdraw;
    System.out.println("\nYour Current balance is:\n--------------------\nKsh."+bal+"\n--------------------");
    System.out.println("\nDo you wish to withdraw?(y for yes and n for no)");
    Scanner input3 = new Scanner(System.in);
    withdraw_choice = input3.nextLine();
    if(withdraw_choice.equals("y")){
      System.out.println("Enter amount to withdraw:");
      amnt_withdraw = input3.nextInt();
      if(bal>=amnt_withdraw){
      bal = bal-amnt_withdraw;
      System.out.println("Success!\n Withdrawal of "+amnt_withdraw+" has been successfully processed. Your new balance is: "+bal);
      mainmenu();
    }
    else{
      System.out.println("\nSorry! You do not have sufficient balance to complete this request.\n");
      mainmenu();
    }
    }
    else{
    System.out.println("Exiting Module");
    mainmenu();
  }
  }
  static void namenbal(){
    System.out.println("\n===============");
    System.out.println("Account Details");
    System.out.println("===============");
  System.out.println("Name of account holder: "+name+"\nAccount balance: "+bal+"\n");
  mainmenu();
  }
  static void exit(){
    System.out.println("-++++++++++++++++++++++++++-");
    System.out.println("Thank you for using the bank");
    System.out.println("-++++++++++++++++++++++++++-");
  }
  static void mainmenu(){
    int choice;
    Scanner input = new Scanner(System.in);
    System.out.println("Bank Account Details");
    System.out.println("====================");
    if (choice_counter==0){
    System.out.println("1.Enter account details\n2.Deposit money\n3.Check balance and withdraw\n4.Display name and balance\n5.Exit");
    System.out.println("\nPlease use choose a command:(Use command number)");
    choice = input.nextInt();
    switch(choice){
      case 1:init();break;
      case 2:System.out.println("\n###########################################################");System.out.println("Please input initial details first!\n");mainmenu();break;
      case 3:System.out.println("\n###########################################################");System.out.println("\nPlease input initial details first!\n");mainmenu();break;
      case 4:System.out.println("\n##########################################################");System.out.println("\nPlease input initial details first!\n");mainmenu();break;
      case 5:exit();break;
      default:System.out.println("Sorry you have made an invalid Choice. Exiting Program");    }
    }
    else if(choice_counter==1){
    System.out.println("2.Deposit money\n3.Check balance and withdraw\n4.Display name and balance\n5.Exit");
    System.out.println("\nPlease use choose a command:(Use command number)");
    choice = input.nextInt();
    switch(choice){
      case 1:init();break;
      case 2:depo();break;
      case 3:withdraw();break;
      case 4:namenbal();break;
      case 5:exit();break;
      default:System.out.println("Sorry you have made an invalid Choice. Exiting Program");    }
  }


  }
}
