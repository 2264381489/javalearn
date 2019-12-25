package nihao;

public class gongsi {
    int a[][]={{3,4,5},{6,5,4},{3,2,1}};
    int all;
    void jisuan(){
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                all+=a[i][j];
            }

            System.out.println(all);
            all=0;
        }
    }

}
