package OPPs.lec5.Interfaces;

public class Car implements Break, Engine{

    @Override
    public void brake() {
        System.out.println("Brake lag gaya");
    }

    @Override
    public void start() {
        System.out.println("Gari start kar engine");
    }

    @Override
    public void stop() {
        System.out.println("Rukk Rukk Rukk engine");
    }

    @Override
    public void acc() {
        System.out.println("Jaldi karrrrrr");
    }


}
