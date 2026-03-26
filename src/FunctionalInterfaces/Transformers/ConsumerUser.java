package FunctionalInterfaces.Transformers;

import java.util.function.Consumer;

public class ConsumerUser<T> {
    private final Consumer<T> consumer;

    public ConsumerUser(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void consume(T t) {
        consumer.accept(t);
    }
}
