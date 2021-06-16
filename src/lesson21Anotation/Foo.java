package lesson21Anotation;
// ну и класс с анотациями, какбы фууу, но и так сойдет
public class Foo {
    @MyAnnotation(name = "foostring")
    String FooString;
    Integer FooInt;
    @MyAnnotation(name="otherExample")
    String OtherExample;

    public String getFooString() {
        return FooString;
    }

    public void setFooString(String fooString) {
        FooString = fooString;
    }

    public Integer getFooInt() {
        return FooInt;
    }

    public void setFooInt(Integer fooInt) {
        FooInt = fooInt;
    }
}
