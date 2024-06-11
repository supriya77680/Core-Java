package java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeStream {

    public static boolean palindrome(long num){
        String s = Long.toString(num);
        StringBuilder sb = new StringBuilder(s).reverse();
        //StringBuilder sb1 = sb.reverse();
        if(sb.toString().equals(s)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        List<Long> list = new ArrayList<>();
        list.add(12345689L);
        list.add(7894554987L);
        list.add(1234554321L);
        list.add(9875648L);
        list.add(9877789L);
        List<Long> streamResult = list.stream().filter(n -> palindrome(n)).collect(Collectors.toList());
        System.out.println(streamResult);
    }

}
