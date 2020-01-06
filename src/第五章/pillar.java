package 第五章;

public class pillar {
    geometry bottom;
    double height;
    pillar(geometry bottom,double height){
        this.bottom=bottom;
        this.height=height;
    }
    public double getVolumn(){
        if(bottom==null){
            return -1;
        }//测试，要是没有底部，就返回-1；
     return bottom.getArea()*height;
    }
}
