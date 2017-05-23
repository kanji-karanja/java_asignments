import java.util.Scanner;
public class NumConversion{
  public static void main(String args[]){
    double numInput,thousand,hundred,tens,ones;
    String thouword,hundword,tenword,oneword;
    System.out.println("Please input number to convert to English Sentence:");
    while(0==0){
    Scanner input = new Scanner(System.in);
    numInput=input.nextInt();
    int numInput2 =(int)numInput;
    if(numInput2<11){
    switch(numInput2){
      case 1:oneword="one";break;
      case 2:oneword="two";break;
      case 3:oneword="three";break;
      case 4:oneword="four";break;
      case 5:oneword="five";break;
      case 6:oneword="six";break;
      case 7:oneword="seven";break;
      case 8:oneword="eight";break;
      case 9:oneword="nine";break;
      case 10:oneword="Ten";break;
      default:oneword="";
    }
    System.out.println("The number in English is: "+oneword);
    }
    else{
    thousand=numInput/1000;
    thousand=Math.floor(thousand);
    int thousand2=(int)thousand;
    switch(thousand2){
    case 1:thouword="one thousand";break;
    case 2:thouword="two thousand";break;
    case 3:thouword="three thousand";break;
    case 4:thouword="four thousand";break;
    case 5:thouword="five thousand";break;
    case 6:thouword="six thousand";break;
    case 7:thouword="seven thousand";break;
    case 8:thouword="eight thousand";break;
    case 9:thouword="nine thousand";break;
    case 10:thouword="Ten Thousand";break;
    case 0:thouword="";break;
    default:thouword="";
    }
    hundred=(numInput/100)-(thousand*10);
    hundred=Math.floor(hundred);
    int hundred2=(int)hundred;
    switch(hundred2){
      case 1:hundword="one hundred";break;
      case 2:hundword="two hundred";break;
      case 3:hundword="three hundred";break;
      case 4:hundword="four hundred";break;
      case 5:hundword="five hundred";break;
      case 6:hundword="six hundred";break;
      case 7:hundword="seven hundred";break;
      case 8:hundword="eight hundred";break;
      case 9:hundword="nine hundred";break;
      case 0:hundword="";break;
      default:hundword="";
    }
    tens=(numInput/10)-((thousand*100)+(hundred*10));
    tens=Math.floor(tens);
    int tens2=(int)tens;
    switch(tens2){
      case 1:tenword="ten";break;
      case 2:tenword="twenty";break;
      case 3:tenword="thirty";break;
      case 4:tenword="forty";break;
      case 5:tenword="fifty";break;
      case 6:tenword="sixty";break;
      case 7:tenword="seventy";break;
      case 8:tenword="eighty";break;
      case 9:tenword="ninety";break;
      default:tenword="";
    }
    ones=(numInput/1)-((thousand*1000)+(hundred*100)+(tens*10));
    ones=Math.floor(ones);
    int ones2=(int)ones;
    switch(tens2){
      case 1:oneword="one";break;
      case 2:oneword="two";break;
      case 3:oneword="three";break;
      case 4:oneword="four";break;
      case 5:oneword="five";break;
      case 6:oneword="six";break;
      case 7:oneword="seven";break;
      case 8:oneword="eight";break;
      case 9:oneword="nine";break;
      default:oneword="";
    }
    System.out.println("The number in English is: "+thouword+" "+hundword+" and "+tenword+" "+oneword);
  }
  }
}
}
