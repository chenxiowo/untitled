package day03;

public class day0302 {

//    Java的主方法，程序的入口
//    public 可见性（权限修饰符）：项目中的任意位置都可以访问该方法
//    static 修饰关键字：静态
//    void 该方法的返回值类型：无返回值
//    main 方法名字
//    (形参数据类型 形参名，形参数据类型 形参名 )形式参数简称：形参
//     { 该方法的方法体 }
    public static void main(String[] args) {

//        方法（函数）
//        方法调用：方法名();
//        再调用方法时，传递的参数，称作实际参数、简称：实参

//        直接输出方法的返回值，查看结果
//        System.out.println(getSum(5,8));

//        由main()调用getSum()得知:方法内部可以调用其他方法

//        System.out.println(numA);
        getSum2(5,10);
    }

//    创建方法的位置：类中，与其他方法同级（方法的内部不能创建其他方法）
//    方法创建后，若不调用该方法，则方法不会执行
//    设计一个方法，将两个整数和输出至控制台
//    两个位置的整数，以形参设置
    public static int getSum(int numA,int numB){
//        return 关键字：在方法的内部出现，返回方法的结果，return后面的方法是不执行的
        return numA+numB;
//        System.out.println("我在return关键字的下一行");
    }

    public static void getSum2(int numA,int numB){
        System.out.println(numA+numB);
    }




}
