package day07;

public class day0701 {
    public static void main(String[] args) {
//        什么是方法 完成特定功能的代码片段
        getMax(15,25);
        gety(2,5);
        System.out.println(gety(2,5));
        System.out.println(getMax(15,25));
        getMax2(23,17);
    }

    //方法位置：在类里面，限main方法同级
    //可见性 修饰词 返回值类型 方法名（参数类型）{方法体}
    public static int getMax(int x,int y){
        if (x>y){
            return x;
        }
        return y;
    }
    public static void getMax2(int x,int y){
        if (x>y){
            System.out.println(x);
        }
        System.out.println(y);
    }




    public static boolean gety(int x,int y){
        if (x>y){
            return true;
        }
        return false;
    }



}
