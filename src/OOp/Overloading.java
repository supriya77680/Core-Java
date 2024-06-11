package OOp;

public class Overloading {

    public int add(int a, int b){
        return a+b;
    }

    public int add(int a, int b, int c){
        return a+b+c;
    }

    public int add(byte a, byte b){
        return a+b;
    }

    public int add(int a, short b){
        return a+b;
    }

    public int add(short a, int b){
        return a+b;
    }



    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.add(5,10);                 //it will only take int parameter everytime because int is default
        o.add(5, 10, 15);
        o.add(2, 1);

    }
}
