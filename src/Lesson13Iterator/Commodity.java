package Lesson13Iterator;


import java.util.*;

public class Commodity {

    private static  List<Product> products = new ArrayList<>();
    private static  Scanner scanner = new Scanner(System.in);
    private static final WeigthComparator weigthComparator =  new WeigthComparator();
    private static final LengthComparator lengthComparator = new LengthComparator();
    private static final WidthComparator widthComparator = new WidthComparator();

    /*Реалізовуємо консольну програму. Створити клас Commodity. Описати даний клас: поля методи.
        Повинні бути такі методи:
        ● Додати товар
        ● Видалити товар
        ● Замінити товар
        ● Сортувати за назвоню
        ● Сортувати за довжиною
        ● Сортувати за шириною
        ● Сортувати за вагою
        ● Виводимо і-тий елемент колекції(який ми вводимо з консолі(використовуємо Scanner))
        ● Вийти з програми(підказка System.exit)
        Для меню використати Switch.*/


    public static void addProduct() {
        boolean error = false;
        Product product = new Product();
        System.out.println("Type name,weight,length,width separated by coma");
        String productInputInfo = scanner.next();
        String[] split = productInputInfo.split(",");
        if (split.length != 4) {
            System.out.println("Wrong input, try again");

        } else {
            product.setName(split[0]);
            try {
                product.setWeight(Integer.parseInt(split[1]));

                product.setLength(Integer.parseInt(split[2]));
                product.setWidth(Integer.parseInt(split[3]));
            } catch (NumberFormatException e) {

                System.out.println("One or all params must be Integers only, we live in perfect world");
                error = true;
                throw new RuntimeException(e);

            }
            if (!error) {
                products.add(product);
            }

        }
    }

    public static void removeProduct() {
        System.out.println("Type Product name followed by enter");
        String name = scanner.next();
        Iterator<Product> it = products.iterator();
        int count = 0;
        while (it.hasNext()) {
            if (it.next().getName().equals(name)) {
                it.remove();
                count++;
            }


        }
        System.out.println(count + " products with name " + name + " was deleted ");

    }

    public static void replaceItem() {
        System.out.println("Enter name of product to replace");
        String toReplacename = scanner.next();

        ListIterator<Product> lit = products.listIterator();
        List<Integer> choiceindexe = new ArrayList<>();
        while (lit.hasNext()) {
            if (lit.next().getName().equals(toReplacename)) {
                choiceindexe.add(lit.previousIndex());
            }
        }

        if (!choiceindexe.isEmpty()) {
            System.out.println("Type number of product to replace");
            for (int x : choiceindexe
            ) {

                System.out.println(x + " " + products.get(x));

            }
            Product toReplace = new Product();
            try {
                toReplace = products.get(Integer.parseInt(scanner.next()));
            } catch (Exception e) {
                System.out.println("Wrong number, error occurred, and i am to tiered to handle that shit, bye bye !!!");
                System.exit(0);
            }
            System.out.println("Lets add product for replace,type Name and all properties coma separated,example Moloko,6,6,6");
            Product product = new Product();
            String productInputInfo = scanner.next();
            String[] split = productInputInfo.split(",");
            if (split.length != 4) {
                System.out.println("Wrong input, try again");

            } else {
                product.setName(split[0]);
                try {
                    product.setWeight(Integer.parseInt(split[1]));
                    ;
                    product.setLength(Integer.parseInt(split[2]));
                    product.setWidth(Integer.parseInt(split[3]));
                } catch (NumberFormatException e) {
                    System.out.println("One or all params must be Integers only, we live in perfect world");
                    throw new RuntimeException(e);
                }

                Collections.replaceAll(products, toReplace, product);


            }

        } else {
            System.out.println("Product with that name not founded");

        }


    }

    public static void sortByName() {
        Collections.sort(products);
    }

    public static void sortByWeight(){
        products.sort(weigthComparator);
    }

    public static void sortByHeight() {
        products.sort(lengthComparator);
    }

    public static void sortByWidth() {
        products.sort(widthComparator);
    }

    public static void showProduct() {
        System.out.println("Enter products position in list");
        try {
            System.out.println(products.get(Integer.parseInt(scanner.next())));
        } catch (NumberFormatException | NullPointerException e) {
            e.printStackTrace();
            System.out.println("Something is wrong !!!");
        }

    }

    public static void showAll() {
        for (Product x : products
        ) {
            System.out.println(x);
        }

    }
}

