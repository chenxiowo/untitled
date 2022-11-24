package oopDay04;

public /*final*/ class Person {
    private String id;
    private String name;
    private String sex;

    public Person() {
        System.out.println("Person类的无参构造");
    }

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Person类两个参数有参构造");
    }

    public Person(String id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        System.out.println("Person类三个参数有参构造");
    }
    public /*final*/ void show(){
        System.out.println("我的身份证是"+id+"名字"+name+"性别"+sex);
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
