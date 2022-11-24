package day06;

public class Student {
//    描述类的属性   全局变量
    String id;//学号
    String name;//名字
    char sex;//性别
    String department;//专业
    int age;//年龄

//    描述类的行为   成员/示例方法
    public void study(){
        System.out.println(name+"学生在学习");
    }

    public void spor(){
        System.out.println(name+"学生在运动");
    }

    public void show(){
        System.out.println("-----");
        System.out.println("我的卡号是："+id);
        System.out.println("我的姓名是："+name);
        System.out.println("我的性别是："+sex);
        System.out.println("我的专业是："+department);
        System.out.println("我的年龄："+age);
    }
}
