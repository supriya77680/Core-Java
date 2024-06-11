package OOp;

public class B_Subclass extends B{
    @Override
    protected void m2() {
        System.out.println("m2 of Bsubclass");
    }

    @Override
    void m3() {
        System.out.println("m3 of Bsubclass");
    }

    public static void main(String[] args) {
        B_Subclass b = new B_Subclass();
        b.m1();
        b.m2();
        b.m3();
    }
}
