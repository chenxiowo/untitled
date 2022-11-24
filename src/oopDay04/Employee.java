package oopDay04;

public class Employee {
    private String id;
    private String name;
    private String age;
    private String xinzi;

    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Employee(String id, String name, String age, String xinzi) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.xinzi = xinzi;
    }

    @Override
    public String toString() {
        return "编号"+id+"姓名"+name+"年龄"+age+"薪资"+xinzi;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getXinzi() {
        return xinzi;
    }

    public void setXinzi(String xinzi) {
        this.xinzi = xinzi;
    }
}
