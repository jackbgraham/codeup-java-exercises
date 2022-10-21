package shapes;

public class Square extends Rectangle{

    public int getPerimeter(){
        return 4 * super.length;
    }

    public int getArea(){
        return (int) Math.pow(super.length, 2);
    }
    public Square(int side){
        super(side, side);
    }
}
