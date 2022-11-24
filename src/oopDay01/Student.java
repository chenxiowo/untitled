package oopDay01;

public class Student {
    String id;
    String name;
    char sex;
    String department;
    int age;

//    构造方法 无参构造
    public Student(){
        System.out.println("----Student类  无参构造----");
    }

//    构造方法 有参构造
    public Student(String _id,String _name ){
        System.out.println("Student类 有参构造（2个参数）");
        id=_id;
        name=_name;
    }

//    构造方法 有参构造
    public Student(String _id,String _name,char _sex,
                   String _department,int _age){
        System.out.println("Student类 有参构造（5个参数）");
        id = _id;
        name = _name;
        sex = _sex;
        department = _department;
        age = _age;
    }



    public void study(){
        System.out.println(name+"学生在学习");
    }

    public void sleep(){
        System.out.println(name+"在睡觉！");
    }
    public void show(){
        System.out.println("---------");
        System.out.println("我的枪号是："+id);
        System.out.println("我的名字是："+name);
        System.out.println("我的性别是："+sex);
        System.out.println("我的专业是："+department);
        System.out.println("我的年龄是:"+age);
    }


}
