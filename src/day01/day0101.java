package day01;

public class day0101 {
//    main方法，java程序的入口
    public static void main(String[] args) {
//        知识点1：输出语句2种
//        1.1 带换行的输出语句
//        带换行的输出语句快捷方式 sout+回车
        System.out.println("开学第一节课");
        System.out.println("开学第二节课");
        System.out.println("开学第三节课");
//        1.2不带换行的输出语句
        System.out.print("开学第四节课");
        System.out.print("开学第五节课");
        System.out.println();

//        知识点2：注释 3种
//        2.1单行注释 ctrl+/
            /*  2.2多行注释
            ctrl+shift+/  */
            /*2.3文档注释
            文档注释用于类或方法前添加，可以生成jdk文档*/
//
//            知识点3.变量和常量
//        变量：在程序运行期间，暂时存放数据的地方
//        int a;//变量的声明 ：数据类型 变量名
//        a=8;//变量的赋值
//        int b=3;  //变量的声明+赋值
//        b=10;
//        System.out.println("b:"+b);

//        常量：java通过关键字final定义常量。常量是只能赋值一次
        final double PI=3.1415926;
//        PI=3.14;  final修饰的常量只能赋值一次。

//        知识点4：数据类型
//          4.1整数类型 默认是int类型
//        byte(1字节=8位） ，short(2字节=16位), int(4字节=32位），long(8字节=64位)
//        注意：
//        a.整数类型默认是int类型
//        b.给long变量赋值是，数据后面建议加上L
        byte score=127;
        long long1=22222222222222L;//给long变量赋值是，数据后面建议加上L

//        4.2 浮点类型 默认是double类型
//        float(4字节=32位）    double(8字节=64位)
//        注意：
//        a.浮点类型 默认是double类型 ，即任何一个小数都是double类型常量
//        b.给float变量赋值时，数据后面必须加上f或F
//        c.给double变量赋值时，数据后面可以加d或D，或什么也不加。
        float f1=1.23F;
        double d1=1.23;

//        4.3 字符类型 char java通过单引号定义字符类型
//        char类型长度是2字节=16位
//        java采用unicode编码
        char c1='a';
        char c2='4';
        char c3='我';
        char c4='\u6211';
        System.out.println("c4:"+c4);

//        4.4布尔类型 boolean 值只有true和false
        boolean boo1=true;
        boolean boo2=false;
        boolean boo3= 3>=7;
        System.out.println("boo3="+boo3);

//        知识点5：强制类型转换规则
//        5.1高精度的数据赋值给低精度的变量，需要强转
//        精度的由低到高：byte,short,char,int,long,float,double
//        例1
//        int x=100;
//        byte b= (byte) x; //高精度的数据赋值给低精度的变量，需要强转
//        例2
//        byte b2=30;
//        int x2=b2; //低精度的数据赋值给高精度的变量，不需要强转

//      例3:高精度的数据超过了低精度变量的范围，赋值后也不对。
        int x3=439;//110110111
        byte b3=(byte)x3;
        System.out.println("b3="+b3);

//        5.2 浮点类型的数据赋值给整数类型的变量，需要强转（取整，小数部分全部舍去）
//        例1
//        float d=1.98f;
//        int x= (int) d;
//        System.out.println("x="+x);

//        例2
        int x2=100;
        float d2=x2;

//        5.3 不同类型的数据运算，会先自动的把低精度的数据转换为高精度。
        int d= (int) (1  +  1.6f  +  3.8D);
        System.out.println("d="+d);
        //        精度的由低到高：byte,short,char,int,long,float,double
    }

}
