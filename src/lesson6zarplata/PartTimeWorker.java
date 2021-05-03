package lesson6zarplata;

public class PartTimeWorker implements Zarplata{
    private double  dollarsperhour ;
    private String name;
    private double  workinghours;

    public double getDollarsperhour() {
        return dollarsperhour;
    }

    public void setDollarsperhour(double dollarsperhour) {
        this.dollarsperhour = dollarsperhour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkinghours() {
        return workinghours;
    }

    public void setWorkinghours(double workinghours) {
        this.workinghours = workinghours;
    }

    @Override
    public void Salary() {
        System.out.println("Worker "+ name +  " earned " + dollarsperhour*workinghours);
    }
}
