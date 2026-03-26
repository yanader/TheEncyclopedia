package FunctionalInterfaces.Transformers;

import java.util.function.BiConsumer;

public class BiConsumerUser<T, U> {
    private final BiConsumer<T, U> biConsumer;

    public BiConsumerUser(BiConsumer<T, U> biConsumer) {
        this.biConsumer = biConsumer;
    }

    public void consume(T t, U u){
        biConsumer.accept(t, u);
    }
}
