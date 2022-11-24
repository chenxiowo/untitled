package oopDay03;

public class oopDay0301 {
    public static void main(String[] args) {
//        知识点1：关键字static（静态）
        Person p1=new Person("1001","张三");
        Person p2=new Person("2001","李四");
        System.out.println("p1的国籍："+p1.nation);
//        静态成员变量可以通过对象，静态成员变量名调用 不推荐！！

        System.out.println("所有人的国籍："+Person.nation);
//        静态成员变量可以通过类名，静态成员变量名调用 推荐！！
        System.out.println(Math.PI);


//        修改国籍 如果是static修饰的静态成员变量，一旦被某个对象修改，
//        所有的都会改变
//        p1.nation="炎黄子孙";
//        System.out.println(p1.nation);
//        System.out.println(p2.nation);

//        1.2static修饰方法叫做类方法/静态方法
        System.out.println(p1.gerNation());//不推荐
        System.out.println(Person.gerNation());//推荐

//        静态方法使用限制
//        a.静态方法只能调用其他的静态方法
//        b.静态方法只能调用静态成员变量
//        c.静态方法里可以访问任何的静态方法和静态变量

//        注意：
//          关于静态变量，静态方法和非静态方法都可以访问：
//          非静态方法可以访问任何的静态方法和静态变量

//        总结：
//          静态方法只能访问静态资源
//          有了对象，静态方法和成员方法都可以调用，
//          即成员方法里可以访问静态资源

//        1.3static修饰代码块叫做静态代码块
//        静态代码块会在类加载时主动执行一次
//        非静态代码块在每次new对向前都会执行一次

//        类初期化的顺序
//        静态（静态变量，静态方法，静态代码块）
//        非静态（非静态变量，非静态方法，非静态代码块）
//        构造器

        StaticSequence test = new StaticSequence();



    }
}
