package OPPs.lec2;

public class Singleton {
    // A singleton class is a class whose only one object can be created

    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // check if only 1 object is required to construct, by default instance==null
        if(instance==null){
            instance = new Singleton();
        }

        return instance;
    }
}

class Main{
    public static void main(String[] args) {
//        Singleton obj = new Singleton();
//        This will show error as it's a private constructor, it cannot be accessed outside its class

        Singleton obj = Singleton.getInstance();
        // by use of instance one object is created

        Singleton obj2 = Singleton.getInstance();
        // as 1 object is already created thus this reference variable will also point to the same object
        // both are pointing to one object only.
    }
}
