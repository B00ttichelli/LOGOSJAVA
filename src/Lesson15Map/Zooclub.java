package Lesson15Map;

import java.util.*;

public class Zooclub {
    static private Map<Person, List<Animal>> zooclub = new HashMap<>();
    static private Scanner scanner = new Scanner(System.in);
    static private String input = "";
    static private String[] splited;
    final private static String TYPE_USER = "Type member name and age coma separated. Example Drazraperma,77";
    final private static String TYPE_ANIMAL = "Enter animal name and type coma separated. Example Tom,Cat";

    public static void addMember() {
        System.out.println(TYPE_USER);

        input = scanner.next();
        splited = input.split(",");
        if (splited.length > 1) {
            Person person = new Person();
            person.setName(splited[0]);
            try {
                person.setAge(Integer.parseInt(splited[1]));
            } catch (NumberFormatException e) {

                throw e;
            }
            List<Animal> animals = new ArrayList<>();
            zooclub.put(person, animals);
            System.out.println("Added SUC !!!!!!");
            //Хуясебе добавило ыЫЫЫ
        }
    }

    public static void addAnimal() {
        System.out.println("Type member name");
        input = scanner.next();
        Set<Person> memberlist = zooclub.keySet();
        Set<Person> founded = new HashSet<>();

        for (Person p : memberlist
        ) {
            if (p.getName().equals(input)) {

                System.out.println("id " + p.hashCode() + " " + p);
                founded.add(p);
            }

        }
        if (!founded.isEmpty()) {
            System.out.println("type an id");
            int hash = 0;
            try {
                hash = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {

                throw e;
            }

            for (Person p : founded
            ) {
                if (p.hashCode() == hash) {

                    List<Animal> updatedlist = new ArrayList<>(zooclub.get(p));
                    System.out.println(TYPE_ANIMAL);
                    Animal toadd = new Animal();
                    input = scanner.next();
                    splited = input.split(",");
                    if (splited.length == 0 || splited.length > 2) {
                        System.out.println("Something went wrong ");
                    } else {
                        toadd.setName(splited[0]);
                        toadd.setType(splited[1]);
                        updatedlist.add(toadd);
                        zooclub.replace(p, updatedlist);
                        System.out.println("Animal added with SUC !!!");
                    }
                } else {
                    System.out.println(".");
                }

            }

        } else {
            System.out.println("Sorry we didnt founded member with that name");
        }

    }

    private static Person selectperson() {
        System.out.println(TYPE_USER);
        input = scanner.next();
        splited = input.split(",");
        Person toselect = new Person();

        if (splited.length == 0 || splited.length > 2) {
            System.out.println("Something went wrong (splited.length == 0 || splited.length>2) ");
            throw new RuntimeException();
        } else {
            toselect.setName(splited[0]);
            toselect.setAge(Integer.parseInt(splited[1]));


        }
        return toselect;
    }


    public static void PickUpAnimal() {
        Person selected = selectperson();
        if (zooclub.containsKey(selected)) {
            List<Animal> animalslist = zooclub.get(selected);
            System.out.println(TYPE_ANIMAL);
            input = scanner.next();
            splited = input.split(",");
            ListIterator<Animal> it = animalslist.listIterator();
            boolean flag = false;
            while (it.hasNext()) {
                Animal animal = it.next();
                if (animal.getName().equals(splited[0]) && animal.getType().equals(splited[1])) {
                    it.remove();
                    flag = true;
                    zooclub.replace(selected, animalslist);
                }

            }
            if (flag) {
                System.out.println("Animal Removed");

            } else {
                System.out.println("Animal not founded");
            }


        } else {
            System.out.println("Person not founded");
        }


    }

    public static void delMember() {
        zooclub.remove(selectperson());


    }

    public static void show() {
       if(!zooclub.isEmpty()){
           Set<Map.Entry<Person, List<Animal>>> mapentry = zooclub.entrySet();
           for (Map.Entry<Person, List<Animal>> e : mapentry
           ) {
               System.out.println("Member");
               System.out.println(e.getKey());
               System.out.println("has Animal(s)");
               System.out.println(e.getValue());
           }

       }else {
           System.out.println("There is nobody indaCLub ");
       }
    }


}
