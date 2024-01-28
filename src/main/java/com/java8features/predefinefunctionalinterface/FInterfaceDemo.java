package com.java8features.predefinefunctionalinterface;

import java.util.Date;
import java.util.function.*;

public class FInterfaceDemo {

    public void supplierDemo() {
        Supplier<Date> supplier = () -> new Date();
        System.out.println(supplier.get());
    }

    public void consumerDemo() {
        Consumer<String> consumer = (name) -> System.out.println(name);
        consumer.accept("bhairab");

        BiConsumer<String, String> biConsumer = (name1, name2) -> System.out.println(name1.toUpperCase() + " " + name2.toUpperCase());
        biConsumer.accept("bhairab", "patra");
    }

    public void functionDemo() {
        Function<String, String> function = (name) -> name.toUpperCase();
        System.out.println(function.apply("bhairab"));

        BiFunction<String, String, String> biFunction = (name1, name2) -> name1.toUpperCase().concat(name2.toLowerCase());
        System.out.println(biFunction.apply("priyanka", "patra"));
    }

    public static void main(String[] args) {
        System.out.println("This is example of predefine functional interface");
        FInterfaceDemo fDemo = new FInterfaceDemo();
        fDemo.supplierDemo();
        fDemo.consumerDemo();
        fDemo.functionDemo();
    }
}
