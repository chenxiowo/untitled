package oopDay01;

public class Member {
//    全局变量  实例/成员变量
    String id;
    String name;
    char sex='男';
    String level;
    int salary;

//    默认无参构造
    public Member(){

    }

//    自定义有参构造
    public Member(String _id,String _name, String _level,int _salary){
        id=_id;
        name=_name;
        level=_level;
        salary=_salary;
    }

    public Member(String _id,String _name,char _sex, String _level,int _salary){
        id=_id;
        name=_name;
        level=_level;
        salary=_salary;
        sex=_sex;
    }

//    实例/成员方法
//    显示个人信息
    public void show(){
        System.out.println("-----员工信息-----");
        System.out.println("员工工号："+id);
        System.out.println("员工名字:"+name);
        System.out.println("员工性别:"+sex);
        System.out.println("员工级别："+level);
        System.out.println("员工工资："+salary);
    }
}
