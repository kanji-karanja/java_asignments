import java.util.Scanner;
public class marksgenerator{
public static void main(String args[]){
System.out.println("MARKS SYSTEM");
String admno,name;
Scanner details = new Scanner(System.in);
System.out.println("Enter Student admission number:");
admno = details.nextLine();
System.out.println("Enter Student surname number");
name = details.nextLine();
English getMarks = new English();
Kiswahili getMarks2= new Kiswahili();
Maths getMarks3 = new Maths();
History getMarks4 = new History();
Grade sendMarks= new Grade();
int marks[]={getMarks.studentMarks(),getMarks2.studentMarks(),getMarks3.studentMarks(),getMarks4.studentMarks()};
int total;
total = marks[0]+marks[1]+marks[2]+marks[3];
System.out.println("S.no\tS name\tEnglish\tKiswahili\tMaths\tHistory\tTotal\tGrade");
System.out.println(admno+"\t"+name+"\t"+marks[0]+"\t"+marks[1]+"\t"+marks[2]+"\t"+marks[3]+"\t"+total+"\t"+sendMarks.grader(total));
}
}
class English{
  int studentMarks(){
    int cat1, cat2, main,total;
    System.out.println("====================");
    System.out.println("\tEnglish");
    System.out.println("====================");
    Scanner markInput = new Scanner(System.in);
    System.out.println("Enter CAT 1 marks:");
    cat1 = markInput.nextInt();
    System.out.println("Enter CAT 2 marks:");
    cat2 = markInput.nextInt();
    System.out.println("Enter Main Exam  Marks:");
    main = markInput.nextInt();
    total = cat1+cat2+main;
    return total;
  }
}
class Kiswahili{
  int studentMarks(){
    int cat1, cat2, main,total;
    System.out.println("====================");
    System.out.println("\tKiswahili");
    System.out.println("====================");
    Scanner markInput = new Scanner(System.in);
    System.out.println("Enter CAT 1 marks:");
    cat1 = markInput.nextInt();
    System.out.println("Enter CAT 2 marks:");
    cat2 = markInput.nextInt();
    System.out.println("Enter Main Exam  Marks:");
    main = markInput.nextInt();
    total = cat1+cat2+main;
    return total;
  }
}
class Maths{
  int studentMarks(){
    int cat1, cat2, main,total;
    System.out.println("====================");
    System.out.println("\tMaths");
    System.out.println("====================");
    Scanner markInput = new Scanner(System.in);
    System.out.println("Enter CAT 1 marks:");
    cat1 = markInput.nextInt();
    System.out.println("Enter CAT 2 marks:");
    cat2 = markInput.nextInt();
    System.out.println("Enter Main Exam  Marks:");
    main = markInput.nextInt();
    total = cat1+cat2+main;
    return total;
  }
}
class History{
  int studentMarks(){
    int cat1, cat2, main,total;
    System.out.println("====================");
    System.out.println("\tHistory");
    System.out.println("====================");
    Scanner markInput = new Scanner(System.in);
    System.out.println("Enter CAT 1 marks:");
    cat1 = markInput.nextInt();
    System.out.println("Enter CAT 2 marks:");
    cat2 = markInput.nextInt();
    System.out.println("Enter Main Exam  Marks:");
    main = markInput.nextInt();
    total = cat1+cat2+main;
    return total;
  }
}
class Grade{
  String grader(int marks){
    int received=marks/4;
    String grade;
    if(received<100&&received>0){
    switch(received/10){
      case 1:{grade= "E";};break;
      case 2:{grade= "E";};break;
      case 3:{grade= "E";};break;
      case 4:{grade= "D";};break;
      case 5:{grade= "C";};break;
      case 6:{grade= "B";};break;
      case 7:{grade= "A";};break;
      case 8:{grade= "A";};break;
      case 9:{grade= "A";};break;
      case 10:{grade= "A";};break;
      default:{grade= "Invalid";};
    }
  }
  else{
    grade ="Invalid";
  }
  return grade;
  }
}
