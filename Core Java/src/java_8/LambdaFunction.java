package java_8;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunction {

    public static void main(String[] args) {

        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        ar.add(4);
        ar.add(5);

        ar.forEach(n -> System.out.println(n));

        ar.forEach(n -> { if (n%2==0) System.out.print(n);});

    }
}
