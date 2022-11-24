package day07;



public class day0709 {
    public static double qu(int n ,double h){
        for (int i=1;i<=n;i++){
            h/=2;
        }return h;
    }
    public static double digui(int n,double h){
        if (n==1){
            return h/2;
        }else {
            return digui(n-1,h)/2;
        }

    }
    public static double digui2(double h,int n){
        if (n==1){
            return h/2*3;
        }else {
            return digui2(h,n-1)+qu(n,h)*3;
        }
    }
    public static double zhongmi(int n,double h){
        double yigong=0;
        for (int i=1;i<=n;i++){
            h/=2;
            yigong+=h*3;
        }
        return yigong;
    }
    public static int tao(int n,int x){
        int taozi=1;
        for (int i=10;i>n;i--){
            taozi=(taozi+1)*2;
            n++;
        }
        return taozi;
    }
    public static int tao2(int n){
        if(n==10){
            return 1;
        }else {
            return (tao2(n+1)+1)*2;
        }
    }

    public static void main(String[] args) {
        System.out.println(qu(100,100));
        System.out.println(zhongmi(3 ,100));
        System.out.println(digui(100,100));
        System.out.println(tao(1534,1));
    }
}
//4除二减一