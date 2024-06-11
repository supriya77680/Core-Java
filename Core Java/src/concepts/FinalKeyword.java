package concepts;

public class FinalKeyword {                               //if class is final we cannot inherit

    final int a = 10;
//  a =20;                                                //a cannot be reinitialize again

    public final void m1(){
        System.out.print("Cannot override");             //we cannot override final methods
    }

    public static void main(String[] args){
        FinalKeyword finalKeyword = new FinalKeyword();
        System.out.println(finalKeyword.a);
    }
}
