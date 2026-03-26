package FunctionalInterfaces.Transformers;

import java.util.function.BiFunction;

public class BiFunctionTransformer<T, U, V> {
    private final BiFunction<T, U, V> biFunction;

    public BiFunctionTransformer(BiFunction<T, U, V> biFunction) {
        this.biFunction = biFunction;
    }

    public V transform(T t, U u) {
        return biFunction.apply(t, u);
    }
}
