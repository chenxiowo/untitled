package day07;

public class day0703 {
//    方法重载
//    在一个类里，方法同名不同参（参数个数或类型不同），方法的返回值不作要求~！
public static void main(String[] args) {
    System.out.println(getMax(3.3,6.6));

}
    public static int getMax(int x,int y){
        if (x>y){
            return x;
        }
        return y;
    }

    public static double getMax(double x,double y){
        if (x>y){
            return x;
        }
        return y;
    }
}
