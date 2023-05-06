package day34_b_encapsulation.square;

public class C5_Square {
    //Data: instance var - side
    private int side;



    // Make constructor - accepts one arg - side
    public C5_Square(int side) {
        // this.side = side;
        setSide(side);
    }





    //assign value to the instance variable - side indirectly.
    // if side is over 0
    public void setSide(int side) {
        if (side > 0) {
            this.side = side;
        }
    }


    public int getSide () {
        return side;
    }


    public  int calculateArea () {
        return side * side;
    }

    public int calculatePerimeter(){
        return 4 * side;
    }

}