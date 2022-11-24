package oopDay06;

public class Cat extends Animal{
    public String eyecolor;

    public Cat() {
    }

    public Cat(String name, String eyecolor) {
        super(name);
        this.eyecolor = eyecolor;
    }

    public String getEyecolor() {
        return eyecolor;
    }

    public void setEyecolor(String eyecolor) {
        this.eyecolor = eyecolor;
    }

    @Override
    public void shot() {
        System.out.println("小猫喵喵喵");
    }
    @Override
    public void eat(){
        System.out.println("小猫吃鱼");
    }
    public void climb(){
        System.out.println("小猫会爬树");
    }
}
