package java_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Supriya");
        names.add("Vijaya");
        names.add("Pallavi");

        Optional<String> foundName = findName(names, "Supriy");
        foundName.ifPresentOrElse(
                name -> System.out.println("Found name: " + name),
                () -> System.out.println("Name not found")
        );

    }

        public static Optional<String> findName(List<String> names, String targetName) {
            for (String name : names) {
                if (name.equals(targetName)) {
                    return Optional.of(name);
                }
            }
            return Optional.empty();
        }
}
