package OPPs.lec5.Interfaces;

public interface Engine {

    static final int price = 1000;

    void start();
    void stop();
    void acc();
}

/**
 * Interface is used to do multiple inheritance
 * Only function without definition are declared in it.
 * variables are defined as static final
 * This is done because its object cannot be created.
 */
