package oopDay06;

public abstract class Animal {
    private String name;

//    吼叫
    public abstract void shot();

//    吃
    public void eat(){
        System.out.println("动物吃东西");
    }
//    运动
    public void sport(){
        System.out.println("动物运动");
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
