package OPPs.lec5;

public class child extends parent {

    @Override
    void career(String name){
        System.out.println("Doctor " + name);
    }

    @Override
    void partner(String name, int age){
        System.out.println("She is " + name + ". She is " + age);
    }
}
