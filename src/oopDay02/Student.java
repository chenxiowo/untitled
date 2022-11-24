package oopDay02;

public class Student {
    private String id;//私有的
    String name;
    public char sex;
    String department;
    int age;
    //    构造方法 无参构造
    public Student(){
        System.out.println("----Student类  无参构造----");
    }
    public Student(String id,String name){
        System.out.println("Student类 有参构造（2个参数）");
//        this的作用1：在方法里，通过this明确调用全局变量，解决和局部变量命名冲突的问题
        this.id=id;
        this.name=name;
    }

    public Student(String id, String name, char sex, String department, int age) {
//        this的作用2：在构造方法的第一行里，通过this（）调用本类的其他构造方法
        this(id,name);
        System.out.println("Student类 有参构造（5个参数）");
//        this.id = id;
//        this.name = name;
        this.sex = sex;
        this.department = department;
        this.age = age;
    }

    public void show(){
        System.out.println("----------");
        System.out.println("我的枪号是："+id);
        System.out.println("我的名字是："+name);
        System.out.println("我的性别是："+sex);
        System.out.println("我的专业是："+department);
        System.out.println("我的年龄是:"+age);
    }

//    返回当前学生的学号
    public String gerid(){
        return id;
    }
}
