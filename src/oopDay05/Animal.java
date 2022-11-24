package oopDay05;

public class Animal {
    private String name;
//    吼叫声
    public void shot(){
        System.out.println("动物在吼叫");
    }

//    觅食
    public void eat(){
        System.out.println("动物觅食");
    }

//    休息
    public void sleep(){
        System.out.println("动物休息");
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
