package Lesson17InnerClases;

public class Product implements Comparable<Product> {
    private int weight;
    private int length;
    private int width;
    private String name;

    @Override
    public int compareTo(Product product) {

        if (!this.name.equals(product.name)) {
            return name.compareTo(product.name);
        } else {
            if (this.weight == product.weight && this.length == product.length && this.width == product.width) {
                return 0;
            } else if (this.weight< product.weight || this.width < product.weight || this.length< product.length) {
                return -1;
            } else {
                return 1;
            }
        }

    }

    @Override
    public String toString() {
        return "Product " + name +
                " weight= " + weight +
                ", length= " + length +
                ", width= " + width +
                '\'';
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

