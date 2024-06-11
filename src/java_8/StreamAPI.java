package java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        List<String> string = new ArrayList<>();
        string.add("Supriya");
        string.add("Vijaya");
        string.add("Pallavi");
        string.add("Vaishnavi");

        List streamResult = list.stream().limit(4).collect(Collectors.toList());
        System.out.println(streamResult);

        List streamResult1 = list.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(streamResult1);

        List streamResult2 = string.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(streamResult2);
    }
}
