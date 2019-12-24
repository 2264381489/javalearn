package nihao;

public class run {
    public void hun(int a) {
        if (1 <= a && a <= 9) {
            for (int i = 1; i < a; i++){
                for (int j = 1; j < a; j++) {
                    System.out.print("*");
                }
                System.out.println();
        }}
    }
    void qual(int a, int b){
        System.out.println ((a<b)?a:b);
    }
    void qual(float a, float b){
        System.out.println ((a<b)?a:b);
    }
    void qual(double a, double b){
        System.out.println ((a<b)?a:b);
    }
}
