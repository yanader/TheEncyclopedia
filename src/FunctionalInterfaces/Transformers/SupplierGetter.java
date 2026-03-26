package FunctionalInterfaces.Transformers;

import java.util.function.Supplier;

public class SupplierGetter<T> {
    private final Supplier<T> supplier;

    public SupplierGetter(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T supply() {
        return supplier.get();
    }
}
