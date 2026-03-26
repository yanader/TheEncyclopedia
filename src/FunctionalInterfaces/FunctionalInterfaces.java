package FunctionalInterfaces;

import FunctionalInterfaces.Model.Person;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {
    public static void main(String[] args) {

        // A Function to take a name in the format "first last" (case insensitive) and return "Last, First"
        Function<String, String> nameFormatter = s -> {
            String[] parts = s.split(" ");
            return parts[1].substring(0, 1).toUpperCase() + parts[1].substring(1).toLowerCase() + ", " +
                    parts[0].substring(0, 1).toUpperCase() + parts[0].substring(1).toLowerCase();
        };

        // A BiFunction that takes the name of a product and its price and create an invoice line
        // in the format "Item: Name | Price: £x.xx"
        BiFunction<String, Double, String> invoiceCreator = (s, d) -> {
            return "Item: " + s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase() +
                    " | Price: £" + Double.toString(d);
        };

        // A Predicate that takes a Person and checks whether they are 18 or over
        Predicate<Person> ageChecker = person -> person.getAge() >= 18;

        // A BiPredicate that take a product name (String) and a quantity (int) and
        // returns true if the product name is not empty and the quantity is > 0
        BiPredicate<String, Integer> stockChecker = (s, i) -> !s.isEmpty() && i > 0;


    }
}
