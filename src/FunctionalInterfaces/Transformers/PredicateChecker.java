package FunctionalInterfaces.Transformers;

import java.util.function.Predicate;

public class PredicateChecker<T> {
    private final Predicate<T> predicate;

    public PredicateChecker(Predicate<T> predicate) {
        this.predicate = predicate;
    }

    public boolean check(T t) {
        return predicate.test(t);
    }
}
