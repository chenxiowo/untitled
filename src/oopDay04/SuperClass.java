package oopDay04;

public class SuperClass {
    {
        System.out.println("SuperClass非静态代码块");
    }
    static {
        System.out.println("SuperClass静态代码块");
    }

    public SuperClass() {
        System.out.println("SuperClass无参构造");
    }
    public SuperClass(int n){
        System.out.println("SuperClass有参构造");
    }

    @Override
    public String toString() {
        return "哈哈哈";
    }
}
