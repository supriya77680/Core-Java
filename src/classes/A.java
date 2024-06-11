package classes;

public class A {
    int a = 10;
    public void m1(){
        int c = a*a;
        System.out.println(c);
    }

    class B{
        public void m1(){
            int b = a+a;
            System.out.println(b);
        }
    }
}

class C{
    public static void main(String[] args) {
        A.B ba = new A().new B();
        ba.m1();

        A a = new A();
        a.m1();

//        D.E de = new D().new E();
//        de.m2();

        D.E de = new D.E();
        de.m2();
    }
}

class D{
    int x = 50;
   private static int y = 50;

    static class E{
        public void m2(){
           // int y = x+x;
            int z = y+y;
            System.out.println(y);
        }
    }

}

