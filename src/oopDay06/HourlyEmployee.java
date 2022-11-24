package oopDay06;

public class HourlyEmployee extends Employee{
    private int hours;
    private int payPerHour=10;

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int hours) {
        super(name);
        this.hours = hours;
    }

    public HourlyEmployee(String name, int hours, int payPerHour) {
        super(name);
        this.hours = hours;
        this.payPerHour = payPerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(int payPerHour) {
        this.payPerHour = payPerHour;
    }

    @Override
    int getSalary() {
        return hours*payPerHour;
    }
    public void getSalary(int getSalary){
        System.out.println(getSalary);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hours=" + hours +
                ", payPerHour=" + payPerHour +
                '}';
    }
}
