package day07;

public class day0708 {
    public static int shu(int a, int b) {
        int min=( a < b ) ? a : b;
        for (int i=min ;i>=1;i--){
            if (a%i==0&&b%i==0){
                return i;
            }
        }
        return 1;
    }
    public static int leijia(int x) {
        if (x == 1) {
            return 1;
        }else {
            return leijia(x-1)+x;
        }
    }
    public static int cheng(int x){
        if (x==1){
            return 1;
        }else{
            return cheng(x-1)*x;
        }
    }
    public static int chengfor(int x){
        int sum=1;
        for (int i=1;i<=x;i++){
            sum*=i;
        }
        return sum;
    }
    public static int chengwhile(int x){
        int sum=1; int i=2;
        while (i<=x){
            sum*=i;
            i++;
        }return sum;
    }
//    public static int shu(int a, int b) {
//        int min=( a < b ) ? a : b;
//        for (int i=min ;i>=1;i--){
//            if (a%i==0&&b%i==0){
//                return i;
//            }
//        }
//        return 1;
//    }
    public static int zhuida(int x, int y){
        int shu=0;
        if (x==y){
            return x;
        }else {
            if (x>y){
                return zhuida(x-y,y);
            }else {
                return zhuida(y-x,x);
            }

        }

    }

    public static void main(String[] args) {
        System.out.println(cheng(6));
        System.out.println(chengfor(6));
        System.out.println(chengwhile(6));
        System.out.println(zhuida(9,15));
    }
}
