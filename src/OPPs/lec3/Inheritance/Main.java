package OPPs.lec3.Inheritance;

public class Main {
    public static void main(String[] args) {

        OPPs3 box = new OPPs3(4, 7.9, 9);
        OPPs3 box2 = new OPPs3(box);
        System.out.println(box.l + " " +box.w+" "+box.h);
        System.out.println(box2.l + " " +box2.w+" "+box2.h);


        // by using this we can't inherit the properties of OPPs3
        BoxWeight box4 = new BoxWeight();

        // Preferred Way
        BoxWeight box3 = new BoxWeight(4,5,1,9);
        System.out.println(box3.h+" "+box3.weight);

        // Private elements can only be used in the same file itself

        /**

        OPPs3 box5 = new BoxWeight(2,6,4,8);
        System.out.println(box5.weight);

        Here weight cannot be accessed because what members can be accessed depends on the
        type of reference variable and not the object type.

        BoxWeight box6 = new OPPs3(2,6,4);
        System.out.println(box6);

        This function is not valid because we had call constructor object of parent class which don't have
        any idea about weight variable of BoxWeight class, thus we can access the weight and even provide value
        for weight variable

        */


    }
}