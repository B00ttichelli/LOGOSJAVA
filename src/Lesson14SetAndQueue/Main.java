package Lesson14SetAndQueue;

import java.util.*;

public class Main {



    public static void main(String[] args) {
        // Creating objects
        Foo foo1 = new Foo("Foo1", 1);
        Foo foo2 = new Foo("Foo2", 2);
        Foo foo3 = new Foo("Foo3", 3);
        Foo foo4 = new Foo("Foo4", 4);
        Foo foo5 = new Foo("Foo5", 5);
        // Creating sets
        Set<Foo> fooSet = new HashSet<>();
        Set<Foo> fooLinkedSet = new LinkedHashSet<>();
        Set<Foo> fooTreeSet = new TreeSet<>();

        //Adding elements in fooHashSet
        fooSet.add(foo1);
        fooSet.add(foo5);
        fooSet.add(foo2);
        fooSet.add(foo4);
        fooSet.add(foo3);
        // Output all
        System.out.println("is not sorted HashSet");
        for (Foo e:fooSet
             ) {
            System.out.println(e);
        }
         //adding objects to Linked Set
        fooLinkedSet.addAll(fooSet);
        //Output all from LinkedSet
        System.out.println("Is LinkedHashSet");
        for (Foo e: fooLinkedSet
             ) {
            System.out.println(e);
        }
        //adding objects to TreeSet

        fooTreeSet.addAll(fooSet);
        System.out.println("Is fucking TreeSet");
        //Output all
        for (Foo e: fooTreeSet
             ) {
            System.out.println(e);
        }




    }


}
