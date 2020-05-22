//mavenTest
public class Rectangle {
    private int length;
    private int widths;

    public Rectangle() {
    }

    public Rectangle(int length, int widths) {
        this.length = length;
        this.widths = widths;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidths() {
        return widths;
    }

    public void setWidths(int widths) {
        this.widths = widths;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", widths=" + widths +
                '}';
    }

    public int getArea(){
        return this.getLength()*this.getWidths();
    }

    public int getPerimeter(){
        return (this.getLength()+this.getWidths())*2;
    }

    public double getDiagonal(){
        return Math.sqrt(this.getLength()* this.getLength() + this.getWidths()*this.getWidths());
    }

    public boolean isSquare(){
        return this.getLength()==this.getWidths() ?true:false;
    }


}
