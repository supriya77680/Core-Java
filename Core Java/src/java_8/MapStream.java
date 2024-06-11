    package java_8;

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Map;
    import java.util.stream.Collectors;

    public class MapStream {

        public static void main(String[] args) {

            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            Map<String, Integer> h = list.stream()
                    .collect(Collectors.toMap(
                            n -> "Square of " + n,
                            n -> n * n));

            System.out.println(h);
        }
    }
