package oopDay04;

public class Student extends Person{
    private String sid;
    private String department;

    public Student() {
        System.out.println("Student类的无参构造");
    }

    public Student(String sid, String department) {
        this();
        this.sid = sid;
        this.department = department;
    }

    public Student(String id, String name, String sid, String department) {
        super(id, name);
        this.sid = sid;
        this.department = department;
    }
    public void showstu(){
        System.out.println("我的学号："+sid+"专业"+department);
    }


    @Override
    public void show(){
        System.out.println("嗨嗨嗨");
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "我的学号："+sid+"  "+"专业:"+department;
    }
}
