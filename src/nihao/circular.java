package nihao;

public class circular {
    circle circle;
    double height;
    double bottom;//底部面积
    //设置底部面积
    double setBottom(circle circle){
         bottom=circle.area;
        return  circle.area;

    }
    //获取高度
    void setHeight(double h){
        height=h;
    }
    //设置体积
     double get_volme(){
        double volme;
        if (bottom == 0){
            return 0;
        }
        else {
          volme=bottom*height;

        }
        return volme;
     }
}
