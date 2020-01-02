package 例子14;

public class People {
    int leg,hand;
    String name;
    People(){
        this.init();
    }
    void init(){
        leg=2;
        hand=2;
        System.out.println("人有"+leg+"条腿"+hand+"只手");
    }
    public static void main(String arg[]){
        People p=new People();
    }
}
