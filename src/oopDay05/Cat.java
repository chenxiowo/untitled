package oopDay05;

public class Cat extends Animal{
    private String eyecolor;//眼睛颜色

    public void climb(){
        System.out.println("小猫会爬树");
    }
    @Override
    public void eat(){
        System.out.println("小猫喜欢吃鱼");
    }
    @Override
    public void shot(){
        System.out.println("小猫喵喵喵");
    }

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
}
