package OPPs.lec4;

public class objectClass {
    /*

                Every class inherits object class.

    */

    int num;

    public objectClass(int num) {
        this.num = num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // Will deal with it in hash map, it is number representation on an object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        objectClass obj1 = new objectClass(13);
        objectClass obj2 = new objectClass(13);
        objectClass obj3 = obj1;

        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());

        if(obj1.equals(obj2)) {
            System.out.println("equal1");
        }
        if(obj1.equals(obj3)) {
            System.out.println("equal2");
        }

        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());
    }
}
