package oopDay06;

public class ContractEmployee extends Employee{
    private int salary;
    public ContractEmployee() {
    }

    public ContractEmployee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    int getSalary() {
        return salary;
    }
    public void getSalary(int getSalary){
        System.out.println(getSalary);
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "salary=" + salary +
                '}';
    }
}
