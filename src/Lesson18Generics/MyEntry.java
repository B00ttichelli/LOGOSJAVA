package Lesson18Generics;

/*
Створити клас MyEntry<K,V>.
        Описати в ньому дженеріками –поля, гетери/сетери, toString.
        Реалізувати в даному класі методи, які б:

        Додавали новий об’єкт в мапу
        Видаляли об’єкт мапи за ключем
        Видаляли об’єкт мапи за значенням
        Виводили на екран Set ключів
        Виводили на екран List значень
        Виводили на екран цілу мапу
*/


import java.util.*;

public class MyEntry <K,V>{


private HashMap<K,V> db = new HashMap<>();

    public HashMap<K, V> getDb() {
        return db;
    }

    public void setDb(HashMap<K, V> db) {
        this.db = db;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "db=" + db +
                '}';
    }

    public void add (K key, V value){
        this.db.put(key,value);
    }

    public void RemoveByKey (K key){
        this.db.remove(key);
    }
    public void RemoveByValue (V value){
        Set<Map.Entry<K,V>> entrySet = this.db.entrySet();
        K key = null;
        for (Map.Entry<K,V> entry : entrySet
             ) {
            if(entry.getValue().equals(value)){
                key=entry.getKey();
            }
        }
        this.db.remove(key);
    }
    public  void ShowSetOFKeys (){ 
       Set<K> keys = this.db.keySet();
        for (K key :keys
             ) {
            System.out.println(key);
        }

        
    }
    public void ShowListOfValues (){
        Collection<V> list = this.db.values();
        for (V item :list
             ) {
            System.out.println(item);

        }


    }

    public void ShowAll (){
        System.out.println(db);
    }
}
