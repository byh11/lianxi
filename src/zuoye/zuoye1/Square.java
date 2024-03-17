package zuoye.zuoye1;

public class Square extends Shape{

    public Square(){
        super(10,10);
    }
    public Square (double length){
        super(length,length);
    }
    @Override
    public double getArea() {
        return this.getLength()*this.getWidth();
    }
}
