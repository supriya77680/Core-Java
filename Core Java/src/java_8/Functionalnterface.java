package java_8;

public interface Functionalnterface {

    int m1(int a, int b);

    default void defaultMethod(){
        System.out.println("Default method");
    }

    default void defaultMethod2(){
        System.out.println("Default method 2");
    }
}
