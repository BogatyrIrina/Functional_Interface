import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        System.out.println("Задание 1");

        Predicate<Integer> positive = i -> i > 0;
        System.out.println(positive.test(-6));
        System.out.println(positive.test(6));
        System.out.println(positive.test(0));

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i > 0;
            }
        };

        System.out.println(predicate.test(-1));
        System.out.println(predicate.test(1));
        System.out.println(predicate.test(0));


        //Задание 2
        System.out.println("Задание 2");

        Consumer<String> Ted = i -> System.out.println(i);
        Ted.accept("Hi, i'm Ted!");
        Consumer<String> Kitty = new Consumer<String>() {
            @Override
            public void accept(String i) {
                System.out.println(i);
            }
        };
        Kitty.accept("Hi, i'm Kitty!");

        //Задание 3
        System.out.println("Задание 3");


    }
}