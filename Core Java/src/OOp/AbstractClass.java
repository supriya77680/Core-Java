package OOp;

//An abstract class can implement multiple interface aswell
public abstract class AbstractClass {
    int a = 10;
    static int b = 20;
    final int c = 30;

    {
        System.out.println("Instance block");
    }

    static{
        System.out.println("Staic block");
    }

    public AbstractClass(){
        System.out.println("Constructor");
    }

    public void check(){
        System.out.println("check() method");
    }

    public abstract void m1();
    protected abstract void m2();
    abstract void m3();

    //  private abstract void m2();     We cannot override private method
    //  static abstract void m5();      We cannot override static method
    //  final abstract void m6();       We cannot override final method
}
