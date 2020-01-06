package 第五章;

public class rectangle extends geometry {
    double a,b;
    rectangle(double a,double b){
        this.a=a;
        this.b=b;
    }
    public double getArea(){
        return a*b;
    }
}
