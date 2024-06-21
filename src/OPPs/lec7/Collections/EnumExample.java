package OPPs.lec7.Collections;

public class EnumExample {
    enum week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // these are num constants
        // public, static and final
        // since its final you cannot create child enum
        // enum can't inherit via extend but can implement interfaces
    }

    public static void main(String[] args) {
        week w;
        w = week.Monday;

        for(week day: week.values()){
            System.out.println(day);
        }

        System.out.println(w.ordinal());
    }
}
