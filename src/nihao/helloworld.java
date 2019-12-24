package nihao;

import java.util.Scanner;


public class helloworld {

    public static void main(String[] arg) {



//        System.out.println("hello world");
//        System.out.println("a");
//        System.out.println("a"+1);
//
//        System.out.println("hello"+"a"+1);
//        System.out.println("a"+1+"hello");
//        System.out.println("5+5="+5+5);
//        System.out.println(5+5+"=5+5");
        Scanner sc = new Scanner(System.in);

        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int y=x+1;
//       int a=sc.nextInt();
//       int b=sc.nextInt();
//       int c=sc.nextInt();
//       int z;
//
//
//     z=(a>b)?(a>c)?a:c:(c>b)?c:b;
//

//        double a=0.01;
//        int i=0;
//        while (a<8848){
//            a=a*2;
//            System.out.println(a);
//            i=i+1;
//        }
//
//        System.out.println(i);
//    }
//    for (int i=0;i<4;i++){
//        for (int a=0;a<5;a++){
//                System.out.print("*");
//
//        }
//        System.out.println();
//    }
//        double m=0;
//        int d=0;
//        while (m<100){
//            switch((int)m%5){
//                case 0: m=m-6;break;
//                default:break;
//            }
//            d=d+1;
//            if (d / 5 == 0){
//                m=m-6;
//            }
//            m=m+2.5;
//        }
//        System.out.println(d);
//        add(a,b);
        run a1=new run();
        a1.hun(a);
        a1.qual(1,2);
        a1.qual(1.2,2.2);
        a1.qual(1.2f,3.4f);


    }

    private static void add( int a, int b) {
        b=a+b;
        System.out.println(b);
    }
    void hun(int a) {
        if (1 <= a && a <= 9) {
            for (int i = 1; i < a; i++) {
                for (int j = 1; j < a; j++) {
                    System.out.print("*");
                }

            }
        }

    }

}
