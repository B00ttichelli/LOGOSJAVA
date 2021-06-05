package Lesson18Generics;

public class Main {
    public static void main(String[] args) {

        MyEntry<Integer,String> myEntry = new MyEntry<>();
        myEntry.add(1,"Hello");
        myEntry.add(2,"ByeBye");
        myEntry.add(3,"Hi");
        myEntry.add(4,"FuckYou");
        myEntry.add(5,"Stupid");
        myEntry.add(6,"AssHole");

        myEntry.RemoveByKey(3);
        myEntry.RemoveByValue("AssHole");
        myEntry.ShowListOfValues();
        myEntry.ShowSetOFKeys();
        myEntry.ShowAll();
    }
}
