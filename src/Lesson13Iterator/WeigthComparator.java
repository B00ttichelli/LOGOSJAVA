package Lesson13Iterator;

import java.util.Comparator;

public class WeigthComparator implements Comparator <Product>{
    @Override
    public int compare(Product product, Product t1) {

        return Integer.compare(product.getWeight(), t1.getWeight());
    }
}
