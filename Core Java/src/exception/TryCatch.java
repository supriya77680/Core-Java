package exception;

import java.sql.SQLOutput;

public class TryCatch {

    public int divide(int a, int b){
        int result = 0;
        try{
          result =  a/b;
            System.out.println(result);
        }catch (ArithmeticException ex){
            System.out.println("Arithmetic Exception has occured");
        }
        finally {
            System.out.println("This will execute in any condition");
        }
        return result;
    }


    //First will print "Hi" then "Finally execute of display()" and will go to return statement
    public void display(){
        try{
            System.out.println("Hi");
            return ;
        }
       // System.out.println("We cannot write any statement after try block");
        finally{
            System.out.println("Finally execute of display()");
        }
    }

    public static void main(String[] args) {
        TryCatch t1 = new TryCatch();
//        t1.divide(10, 5);
//        t1.divide(10,0);
//        t1.divide(20, 2);
        t1.display();
    }
}
