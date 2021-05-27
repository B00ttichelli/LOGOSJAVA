package Lesson16Reflection;

public class SimpleClass {
    private String simplestring;
    private Integer simpleinteger;

    public SimpleClass(){ }

    public SimpleClass(String simplestring, Integer simpleinteger) {
        this.simplestring = simplestring;
        this.simpleinteger = simpleinteger;
    }

    private String getSimplestring() {
        return simplestring;
    }

    @Override
    public String toString() {
        return "SimpleClass{" +
                "simplestring='" + simplestring + '\'' +
                ", simpleinteger=" + simpleinteger +
                '}';
    }

    private void setSimplestring(String simplestring) {
        this.simplestring = simplestring;
    }

    public Integer getSimpleinteger() {
        return simpleinteger;
    }

    public void setSimpleinteger(Integer simpleinteger) {
        this.simpleinteger = simpleinteger;
    }
}
