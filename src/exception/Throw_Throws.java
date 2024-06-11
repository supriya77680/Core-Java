package exception;

import java.io.FileNotFoundException;

public class Throw_Throws {

    int a = 10;
    int b = 20;

    public void m1(){
        if(a>b){
            System.out.println("User is found");
        }else {
            try{                                              //we have to handle whatever we are throwing
               throw new ResourceNotFoundException("User not found");
            //    System.out.println("you cannot write statement after throw");
            }catch (ResourceNotFoundException e){
                System.out.println("Exception Handle");
            }
        }
    }

    public void m2(){
        System.out.println("Calling m2");
    }

    public void m3() throws FileNotFoundException {
        int a = 10;                                        // we have to throw in main method also to
        int b = 0;                                         // propagate exception that it might happen
        int c = a/b;
        System.out.println(c);
    }

    public static void main(String[] args) throws  FileNotFoundException{
        Throw_Throws th = new Throw_Throws();
        th.m1();
        th.m2();
        th.m3();
    }


}
