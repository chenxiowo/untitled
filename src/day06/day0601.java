package day06;

public class day0601 {
    public static void main(String[] args) {
//        知识点1：什么是面向对象？
//        面向对象是一种编程思想，所有的操作都是针对对象的属性和方法

//        知识点2：面向对象的特点：封装；继承；多态；抽象

//        知识点3：什么是类？什么是对象？
//        类是反应像是世界一类事物抽象的概念。例如：学生类
//        对象是类的具体实例。例如：学生张三、学生李四等
//        类和对象的关系：类是对象的模板，对象是类的具体实例。

//        知识点4：java里怎样去描述一个类 java通过关键字class定义一个类
//        属性   -> 全局变量
//        行为   -> 方法

//        知识点5：创建对象   类类型  引用变量名  =  new  类的构造方法();
            Student aa = new Student();
            aa.id="1001";
            aa.name="张天和";
            aa.department="计算机";
            aa.sex='男';
            aa.age=20;
//
        aa.study();
        aa.spor();
        aa.show();

//        创建第二个学生对象
        Student bb = new Student();
        bb.sex='女';
        bb.show();
    }
}
