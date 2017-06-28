import java.util.Scanner;
public class TruthTable{
    public static void main(String[] args) {
        boolean p;
        boolean q;
        boolean and,or,xor,notp,notq,impliesp,impliesq,conditional;
        Scanner input =new Scanner(System.in);
        System.out.println("Please give a truth value for P");
        p = input.nextBoolean();
        System.out.println("Please give a truth value for Q");
        q = input.nextBoolean();
        and= p&q;
        or = p|q;
        xor = p^q;
        notp=!p;
        notq=!q;
        impliesp=!p|q;
        impliesq=!q|p;
        conditional=(and)|(notp&notq);
        System.out.println("P\tQ\t￢P\t￢Q\tP ∧ Q\tP ∨ Q\tP ⊕ Q\tP ⇾ Q\tQ ⇾ P\tP ⇿ Q" );
        System.out.println(p+"\t"+q+"\t"+notp+"\t"+notq+"\t"+and+"\t"+ or+"\t"+xor+"\t"+impliesp+"\t"+impliesq+"\t"+conditional );
     
    }
}