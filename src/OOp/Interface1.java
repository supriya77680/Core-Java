package OOp;

//An interface cannot extend abstract class but can extend interface
public interface Interface1 {

    int a = 10;                                                //by default public static final
    public int b = 20;
    static int c = 30;
    final int d = 40;

//    {
//        System.out.println("Instance block");                We cannot write blocks
//    }
//    static{
//        System.out.println("Static block");
//    }

//    public Interface1(){                                    We cannot write constructor
//        System.out.println("Constructor");
//    }

//    public void check(){                                   We cannot write concrete methods
//        System.out.println("check() method");
//    }

//    protected  void m4();
//    private void m5();
//    static void m6();
//    final void m7();


    abstract void m1();
    public void m2();
    void m3();

    default void defaultMethod(){
        System.out.println("Default method");          //default is used to implement without affecting the already implemented methods
        privateMethod();
    }

    private void privateMethod(){
        System.out.println("Private method");         //Private methods are use for encapsulating calling that in default method
    }

    static void staticMethod(){
        System.out.println("Static method");         //static method are used if it might be implemented somewhere in future
    }


}
