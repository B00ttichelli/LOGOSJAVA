package lesson8enum;



public enum Months {
    JANUARY(31, Seasons.WINTER, "January", "Jan"),
    FEBRUARY(28, Seasons.WINTER, "February", "Feb"),
    MARCH(31, Seasons.SPRING, "March", "Mar"),
    APRIL(30, Seasons.SPRING, "April", "Apr"),
    MAY(31, Seasons.SPRING, "May", "May"),
    JUNE(30, Seasons.SUMMER, "June", "Jun"),
    JULY(31, Seasons.SUMMER, "July", "Jul"),
    AUGUST(31, Seasons.SUMMER, "August", "Aug"),
    SEPTEMBER(30, Seasons.FALL, "September", "Aug"),
    OCTOBER(31, Seasons.FALL, "October", "Oct"),
    NOVEMBER(30, Seasons.FALL, "November", "Nov"),
    DECEMBER(31, Seasons.WINTER, "December", "Dec");


    int dayquantity;
    Seasons season;
    String sname;
    String shorname;

    Months(int dayquantity, Seasons season, String name, String shorname) {
        this.dayquantity = dayquantity;
        this.season = season;
        this.sname = name;
        this.shorname = shorname;
    }

    @Override
    public String toString() {
        return "Months{" +
                "dayquantity=" + dayquantity +
                ", season=" + season +
                ", name='" + sname + '\'' +
                ", shorname='" + shorname + '\'' +
                '}';
    }

    public boolean theEven() {
        // проверка на парные дни
        return this.dayquantity % 2 == 0;
    }

    static public Months getMonthByString(String name) throws IllegalArgumentException {
        boolean flag = false;
        for (Months x : Months.values()
        ) {

            if (x.name().equals(name.toUpperCase())) {

                flag = true;
                return x;
            }

        }
        if (!flag) {
            throw new IllegalArgumentException("Month " + name + " dont exist");

        }

        return Months.APRIL;
    }
}


/*

            1
                    January
                    Jan 	31
                    2
                    February
                    Feb 	28 (29 in leap years)
                    3
                    March
                    Mar 	31
                    4
                    April
                    Apr 	30
                    5
                    May
                    May 	31
                    6
                    June
                    Jun 	30
                    7
                    July
                    Jul 	31
                    8
                    August
                    Aug 	31
                    9
                    September
                    Sep 	30
                    10
                    October
                    Oct 	31
                    11
                    November
                    Nov 	30
                    12
                    December
                    Dec 	31*/
