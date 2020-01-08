package 第五章;

public class test {
    public static void main(String arg[]){
//        这里要用上转类型
        geometry circlebottom=new circle(2.0);//这里使用了上转类型，注意前面pillar中生命的geometry变量，这个就是上转类型的好处，可以用数个子类来对其进行多功能实现，只要有一个大框就ok。
              pillar pillarCircle= new pillar(circlebottom,2.00); //这个是圆底的柱体
        System.out.println(pillarCircle.getVolumn());
        //这里是底边为长方形的柱体
        geometry rectangle=new rectangle(2,4);fsfs
        pillar pillarReactangle=new pillar(rectangle,2);
        System.out.println(pillarReactangle.getVolumn());

    }
}
