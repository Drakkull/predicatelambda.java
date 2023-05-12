package engine;

import entities.Product;
import entities.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List < Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Vibrator", 40.00));
        list.add(new Product("PC",4444.00));
        list.add(new Product("Toy", 25.00));

        double min = 100.0;

       //This removeIf is making use of the ProductPredicate Class, just created.
       // list.removeIf( new ProductPredicate());

        // Now using method reference
        //list.removeIf(Product :: staticProductPredicate);

        //Now using method referecente non Static Way
        //list.removeIf(Product :: nonStaticProductPredicate);

        //Predicate<Product> pred = product -> product.getPrice() >=100;

        //Now using an object and a lambda expression inline

        list.removeIf(product -> product.getPrice() >=min);

        for(Product p : list){

            System.out.println(p);

        }



    }
}
