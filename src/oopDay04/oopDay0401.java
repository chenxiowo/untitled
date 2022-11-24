package oopDay04;

public class oopDay0401 {
    public static void main(String[] args) {
//        知识点1.继承
//        新定义的类从已有的类中获取属性和方法就是继承
//        这个已有的类叫做父类，超类，新定义的类叫做子类或继承类
//        java通过关键字恶心ends、表明继承关系

//        继承的优点：
//        代码具有了重复性，子类可以方便拓展自己持有的属性和方法

//        注意：
//        a.java只支持单继承，即一个子类只能继承于一个父类：
//        b.子类继承父类子类就拥有父类所有的属性和方法
//        c.java的类都直接或间接继承于Object类。

//        注意:子类继承父类,不但子类的属性分配空间存储数据,
//        从父类集成过来的属性也会分配空间存储数据
        Student stu=new Student("1001","计算机");
        stu.show();//子类调用从父类继承的方法
        stu.showstu();//子类调用自身的方法

//        知识点2:方法重写,方法覆盖(Override)
//        方法重写:子类对父类继承的方法进行重写,要去同名同参同返回值.

//        注意:a.子类可以根据需要对父类继承过来的方法进行重写
//            b.方法重写要求同名同参同返回值
//            c.重写方法可见性要大于等于被重写的方法
//            d.为了程序的健壮性,方法重写时加上注释@Override
//            进行编译期的语法检查
//            e.方法重写后：子类对象调用的是重写后的方法
        stu.show();

//        问题:为什么有些对象输出时显示地址，而String对象输出时显示字符串？
        SuperClass s=new SuperClass();
        String a="qwe";
        System.out.println(s);
        System.out.println(a);
        System.out.println(a.toString());
//        打印对象时，会目标调用toString()方法，String类重写了Object类的toString方法，
//        直接返回字符串
//        我们定义的模板根据需要也可以重写Object类的toString方法。
        Student r=new Student("10001","程序");
        System.out.println(r);
//        知识点3：方法重载（Overload）
//        在同一类里，方法同名不同参（参数类型或个数不同）
//        注意：方法重载，对方发的返回值类型不作要求
        System.out.println(yyf());
        System.out.println(yyf(10));

//        知识点4.关键字super
//        4.1什么是super
//        关键字super代表子类对象里对父类对象的一个引用

//        4.2super的作用（2个）
//        a.在子类里可以通过super，调用父类属性和方法
//        b.在子类的构造方法的第一行，通过super（参数列表）调用父类的构造器

//        知识点5.继承中的构造方法
//        5.子类对象构造的过程中必须调用父类的构造方法
//        5.2子类可以在自己的构造方法的第一行通过super（参数列表）调用父类构造方法
//           a.使用super（参数列表）调用父类的构造方法：必须卸载子类构造方法的第一行
//           b.子类的构造方法可以使用this（参数列表）调用父类的构造方法，必须写在子类构造方法的第一行
//        5.3如果子类没有显示的调用父类的构造方法，则Java会默认调用父类的无参构造方法
//        5.4如果子类没有显示调用父类的构造方法，则父类中没有默认构造方法，则编译出错

//        知识点6：关键字final
//        final可以趋势变量，方法，类
//        final修饰变量是常量，只能被赋值一次
//        final修饰的方法不能被重写
//        final修饰的类不能被继承
        final int l=1;
//        l=2; //报错
    }

    public static double yyf(){
        return 2.0;
    }

    public static boolean yyf(int n){
        return true;
    }
}