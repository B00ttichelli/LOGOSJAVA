package lesson6zarplata;

public class FullTimeWorker implements Zarplata {
    private String name ;
    private int workingmonts ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingmonts() {
        return workingmonts;
    }

    public void setWorkingmonts(double workinghours) {
        /* Работник работает 30 дней в месяц по 10 часов в  день
           значит  если часов меньше  300  то работник  проработал всего месяц*/
        if (workinghours<300) {
            this.workingmonts = 1;

        }

        else {
           this.workingmonts = (int) workinghours/300;


        }

    }

    public double getDolarspermonth() {
        return dolarspermonth;
    }

    public void setDolarspermonth(double dolarspermonth) {
        this.dolarspermonth = dolarspermonth;
    }

    private double dolarspermonth;



    @Override
    public void Salary() {
        System.out.println(this.name + " worker  earned " + this.workingmonts * this.dolarspermonth);
    }
}
