package OPPs.lec3.Inheritance;

public class BoxWeight extends OPPs3 {
    double weight;

    public BoxWeight() {
        // this function alone will not work
        this.weight = 0;
    }

    public BoxWeight(double l , double h, double w,double weight) {
        super(l,h,w); // this calls the parent class constructor
        this.weight = weight;

        /*

        Let say we have a 'weight' variable in the parent of BoxWeight and itself also
        In that case we use 'super' keyword instead of 'this' as

        super.weight = 100; -> this weight is in the parent class

         */
    }
}

