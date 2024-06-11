package OOp;

public class I implements Interface1{
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    @Override
    public void m3() {
        System.out.println("m3 method");
    }

    public static void main(String[] args){
        I i = new I();
        i.m1();
        i.m2();
        i.m3();
        i.defaultMethod();
        Interface1.staticMethod();                //call static method by using Interface name

        Interface1 i1 = new Interface1() {       //This is done to demonstrate that interfaces can be implemented anonymously.
            @Override
            public void m1() {
                System.out.println("m1() in Interface object");
            }

            @Override
            public void m2() {

            }

            @Override
            public void m3() {

            }
        };
        i1.m1();
    }
}
