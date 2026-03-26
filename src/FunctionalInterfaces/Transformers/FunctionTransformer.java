package FunctionalInterfaces.Transformers;

import java.util.function.Function;

public class FunctionTransformer<T, U> {
    private Function<T, U> function;

    public FunctionTransformer(Function<T, U> function){
        this.function = function;
    }

    public U transform(T t) {
        return function.apply(t);
    }
}
