package oopDay03;

import oopDay02.Student;

import java.util.Scanner;

public class oopDay0302 {
    public static void main(String[] args) {
//         知识点1：值传递
//        对于基本数据类型而言，调用方法传递的是实实在在的值
//        对于类类型/引用类型而言，调用方法传递的是对象的地址
        Birthday person1 = new Birthday(2000,1,1);
        person1.show();
        System.out.println(person1);

        int month=3;
//        调用方法
        chane(person1,month);
        person1.show();


//        知识点2：关键字package和impact
//        关键字package：为解决类名冲突问题Java提供了包机制
//        用于区别类名的命名空间
//        注意：类名相同，但是在不同包下，是不同的模板


//        关键字import：java通过关键字import导入需要包或类
//        注意：如果使用java.lang包下的类时，不需要导入

//        impact的用法
//        1.单类型导入（single-type-import）,例如:import Java.io.File;
//        2.按需类型导入（type-import-on-demand）,例如:import Java.io.*;

//        使用单类型导入至少有一下两点好处
//        1.提高编译速度
//        2.避免命名冲突

        String str="张三A";


        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a= input.nextInt();
        System.out.println("a:"+a);


//        知识点3：封装
//        3.1封装的概念
//        java将相关的属性和方法封装到类中，java通过可见性来实现封装

//        3.2封装的好处
//        对外可以提供方法供外界主动调用，增加了代码的复用性；
//        对内隐藏实现的细节，以防止不合理的破坏性修改，更加安全


//        知识点4：访问修饰符/访问控制/可见性    3个单词4个范围
//              访问修饰符是来控制类，属性，方法的可见性的关键字
//        修饰符       类内部       同一包       子类       任何地方
//        private      ok
//        (default)    ok          ok         ok
//        protected    ok          ok         ok
//        public       ok          ok         ok          ok

//        结论：类里的成员都设置为private，要提供getter和setter方法供外界调用
        Student sru=new Student();
//        sru.id;
//        stu.name;
        sru.sex='男';

        Birthday p=new Birthday(1990,1,1);
        p.setYear(2000);
        p.show();

    }

    public static void chane(Birthday birthday,int month){
        birthday=new Birthday();
        System.out.println(birthday);
        birthday.setMonth(month);
    }
}
