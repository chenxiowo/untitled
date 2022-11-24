package oopDay03;

public class StaticSequence {
    private static String str="Hello";

    public StaticSequence() {
        str +="DaLian";
        str +="2";
    }

    static {
        System.out.println(str);
        str = "World!";
        System.out.println(str);
    }


    public static void main(String[] args) {
        StaticSequence test = new StaticSequence();
        System.out.println(0);
        System.out.println(str);

    }
}
