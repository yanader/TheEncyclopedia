package FunctionalInterfaces.Transformers;

import java.util.function.BiPredicate;

public class BiPredicateChecker<T, U> {
    private BiPredicate<T, U> biPredicate;

    public BiPredicateChecker(BiPredicate<T, U> biPredicate) {
        this.biPredicate = biPredicate;
    }

    public boolean check(T t, U u) {
        return biPredicate.test(t, u);
    }
}
