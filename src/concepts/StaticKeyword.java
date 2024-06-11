package concepts;

public class StaticKeyword {

    int a = 10;
    static int b = 20;

    public void m1(){
        int c =a+b;
        System .out.println("Instance method " + c);
        m2();
    }

    public static void m2(){
      //  int d = a+b;                         //we cannot use instance variable in static context
      //  m1();                                //we cannot call instance method in static
        int d = b;
        System.out.println("Static method " + d);
    }

    public static void main(String[] args) {
        m2();
        StaticKeyword s = new StaticKeyword();
        s.m1();

    }
}
