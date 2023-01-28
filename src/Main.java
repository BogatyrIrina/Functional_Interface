import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

        Function<Double, Long> function = d -> Math.round(d);
        System.out.println(function.apply(5.7));

        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return  Math.round(aDouble);
            }
        };
        System.out.println(function1.apply(5.7));

        //Задание 4
        System.out.println("Задание 4");

        Supplier <Integer> supplier = () -> (int) (Math.random()*100);
        System.out.println(supplier.get());

        Supplier <Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random()*100);
            }
        };
        System.out.println(supplier1.get());

        //Задание 5
        System.out.println("Задание 5");

        Predicate<Object> condition = p -> 6 > 4;
        Function<Object, Integer> ifTrue = s -> 1;
        Function<Object, Integer> ifFalse = s -> 3;
        Function<String, Integer> safeStringLength = ternaryOperator(condition, ifTrue, ifFalse);
    }

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}