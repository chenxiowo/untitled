package oopDay03;

public class Birthday {
    private int year;
    private int month;
    private int day;

    public Birthday() {
    }

    public Birthday(int year, int month) {
        this.year = year;
        this.month = month;
    }

    public Birthday(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public void show(){
        System.out.println("生日是："+year+"年"+month+"月"+day+"日");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
