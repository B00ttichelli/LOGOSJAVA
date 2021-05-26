package Lesson14SetAndQueue ;

import java.util.Objects;

public class Foo implements  Comparable<Foo>{

    private String foostring;
    private Integer fooint;

    public Foo(String s,Integer i){
        this.fooint = i;
        this.foostring =s;
    }

    public String getFoostring() {
        return foostring;
    }

    public void setFoostring(String foostring) {
        this.foostring = foostring;
    }

    public Integer getFooint() {
        return fooint;
    }

    public void setFooint(Integer fooint) {
        this.fooint = fooint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Foo foo = (Foo) o;
        return Objects.equals(foostring, foo.foostring) && Objects.equals(fooint, foo.fooint);
    }

    @Override
    public int hashCode() {
        return this.foostring.hashCode()+this.fooint.hashCode();
    }

    @Override
    public String toString() {
        return foostring + " "  + fooint ;
    }

    @Override
    public int compareTo(Foo foo) {
        return foostring.compareTo(foo.getFoostring());
    }
}
