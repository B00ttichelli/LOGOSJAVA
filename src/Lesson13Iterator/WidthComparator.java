package Lesson13Iterator;

import java.util.Comparator;

public class WidthComparator implements Comparator <Product>{
    @Override
    public int compare(Product product, Product t1) {
      return Integer.compare(product.getWidth(),t1.getWidth());
    }
}
