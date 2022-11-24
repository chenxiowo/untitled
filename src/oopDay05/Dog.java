package oopDay05;

public class Dog extends Animal{
    private String haircolor;//毛发颜色

    @Override
    public void shot(){
        System.out.println("小狗汪汪汪");
    }
    @Override
    public void eat(){
        System.out.println("小狗吃骨头");
    }

    public Dog() {
    }

    public Dog(String name, String haircolor) {
        super(name);
        this.haircolor = haircolor;
    }

    public String getHaircolor() {
        return haircolor;
    }

    public void setHaircolor(String haircolor) {
        this.haircolor = haircolor;
    }
}
