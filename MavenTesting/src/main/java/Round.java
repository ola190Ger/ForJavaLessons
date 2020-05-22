
public class Round extends Circle {
    public Round() {
    }

    public Round(int r) {
        super(r);
    }

    public double getR() {
        return super.getR();
    }

    public void setR(double r) {
        super.setR(r);
    }

    public double getArea(){
        return Math.PI*this.getR()*this.getR();
    }

    public  double getSectorArea(double alpha){
        return alpha*getR()*this.getR()/2;
    }

    @Override
    public String toString() {
        return "Round{ R= "+super.getR()+'}';
    }
}
