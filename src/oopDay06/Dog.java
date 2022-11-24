package oopDay06;

public class Dog extends Animal{
    private String hairColor;
    @Override
    public void shot() {

    }

    public Dog() {
    }

    public Dog(String name, String hairColor) {
        super(name);
        this.hairColor = hairColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
