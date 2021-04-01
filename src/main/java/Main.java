import model.Entity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arrays.stream(Entity.class.getMethods()).forEach(x -> {
            Arrays.stream(x.getAnnotations()).forEach(System.out::println);
            System.out.println(x);
        });
    }
}
