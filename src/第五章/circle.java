package 第五章;

public class circle extends geometry{
    double r;
    circle(double r){
        this.r=r;
    }
    public double getArea(){
     return (r*r*3.14);
    }
}
