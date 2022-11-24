package day07;

public class day0702 {
    public static void main(String[] args) {
        System.out.println(ti(922,8222,6564));

    }
    public static int ti (int x,int y, int z){
        int sum=0;
        if (x>y){
            sum=x;
        }else {
            sum=y;
        }
        if (sum>z){
            return sum;
        }else {
            return z;
        }

    }
}
