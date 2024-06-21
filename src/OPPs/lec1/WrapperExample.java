package OPPs.lec1;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//
//        Integer num = 47;

        // a.<somthing> is not valid as it is a primitive
        // num.<something> will give use a lot of functions from the Integer class

        Integer a =19;
        Integer b = 46;

        swap(a,b);
        System.out.println(a+" "+b);

        /**

        final int bonus=2;
        bonus =3;

        we can do this operation as now by using 'final' keyword we had made bonus a constant of value 2

        but this only the case with primitives as in object when we use final the reference variable to an object can't
        change but values of variables inside object can change, i.e. object's value can change, but it will always
        point to that object only

        final Student abc = new Student();
        abc.roll =34;
        abc = xyz;  -> where xyz is an object, is not valid

         */


        A obj;

        // several new objects are created with same reference variable as when it will point to next object,  the previous
        // one is destroyed when memory feels the load.
        for(int i=0; i<100000000; i++){
            obj = new A("Random object");
        }


    }

    // Even though we are passing the reference variable then also it will not change as the above values are final
    public static void swap(Integer a, Integer b){
        int temp =a;
        a=b;
        b=temp;
    }

}

class A{
    final int num =17;
    String name;

    A(String data){
        this.name=data;
    }

    // This is a finalize method that destroys object when are not required, this is an automatic process but this
    // function can be used to perform specified function on destruction.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Destroyed");
    }
}
