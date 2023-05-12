package engine;

import entities.Product;
import entities.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List < Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Vibrator", 40.00));
        list.add(new Product("PC",4444.00));
        list.add(new Product("Toy", 25.00));

       //This removeIf is making use of the ProductPredicate Class, just created.
        list.removeIf( new ProductPredicate());



        for(Product p : list){

            System.out.println(p);

        }



    }
}
