package nihao;

public class Example4_81 {

    public static void main(String[] args) {
        double mid;//这个要注意要写在里面，因为要是写在外面的话，因为里面的
//        快捷指令 psvm
        circular circular=new circular();
        circle c=new circle();
       c.radius=5;
       mid=c.area();
       System.out.println(mid);
       circular.setBottom(c);//接收底部面积h'
       circular.setHeight(5);//设置高度
       System.out.println(circular.get_volme());

    }
}
