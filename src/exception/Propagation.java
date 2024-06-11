package exception;

public class Propagation {

    void m1(){
        System.out.println("Inside m1");
       try{
           m2();
       }catch (Exception e){
           System.out.println("Exception handle");
       }

    }

    void m2(){
        System.out.println("Inside m2");
        m3();
    }

    void m3(){
        System.out.println("Inside m3");
        int a = 50/0;
        System.out.println(a);
    }

    public static void main(String[] args) {
        Propagation p = new Propagation();
        p.m1();
        System.out.println("Normal flow");
    }
}
