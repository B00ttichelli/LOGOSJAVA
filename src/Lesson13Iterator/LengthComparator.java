package Lesson13Iterator;

import java.util.Comparator;

public class LengthComparator implements Comparator<Product> {
    @Override
    public int compare(Product product, Product t1) {
    return Integer.compare(product.getLength(),t1.getLength());
    }
}
