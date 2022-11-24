package oopDay04;

public class tes {
    public static void main(String[] args) {
//        第一题 编写类A01，在其中定义方法max，实现求某个double数组的最大值，并返回
        double[] aa={12,58,69,96,78,99,120,2,4};
        A01 bb = new A01();
        System.out.println( bb.max(aa));
//        第二题：编写类Book，定义方法updatePrice；实现更改某本书的价格
//        具体：如果价格>150，则更改为150；如果价格>100，则更改为100，否则不变
        Book aa1=new Book("西游记",99);
        aa1.updatePrice();
        aa1.info();
//        第三题：定义一个圆类Cricle，定义属性：半径，提供显示周长和面积方法
        Cricle cc2=new Cricle(6);
        cc2.mianji();
        cc2.zhouchang();
//        第四题：编程一个Cale计算类，在其中定义两个变量表示两个操作数
//        定义四种方法（和，差，乘，商），并创建两个对象分别创建
        Cale aaa=new Cale(9.9,6.6);
        System.out.println(aaa.div());
    }

}
