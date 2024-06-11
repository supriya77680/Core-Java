package OOp;

public class A extends AbstractClass{

    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    protected void m2() {
        System.out.println("m2 method");
    }

    @Override
    void m3() {
        System.out.println("m3 method");
    }

    public static void main(String[] args) {
        A a = new A();
        a.m1();
        a.m2();
        a.m3();
        a.check();

    }
}
