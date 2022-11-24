package oopDay03;

public class Person {
//    没有static修饰变量叫做非静态变量，成员变量，实例变量
    String id;
    String name;

//    static修饰变量叫做静态成员变量/类变量
    static String nation="中国";

//    静态代码块
    static {
    System.out.println("Person 静态代码块---");
    }
//    非静态代码块
    {
        System.out.println("Person类 非静态代码块---");
    }
//    构造方法 快捷键Alt+insert
    public Person() {
    }

    public Person(String id) {
        this.id = id;
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

//    成员方法/实例方法
    public void show(){
        System.out.println("身份证："+id+"，名字："+name+"，国籍："+gerNation());
    }

//    static修饰方法，叫做静态方法，类方法
    public static String gerNation(){
//        静态方法，类方法里不能调用成员变量和成员方法
        return nation;
    }
}
