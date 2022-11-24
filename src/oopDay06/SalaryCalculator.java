package oopDay06;

public class SalaryCalculator {
    private Employee[] emps=new Employee[5];
    private int index;

    public SalaryCalculator() {
    }


    public boolean addEmp(Employee emp){
        if(index< emps.length){
            emps[index++]=emp;
         return true;
        }else {
            System.out.println(emp.getName()+"添加失败");
            return false;
        }
    }

    public int salarySum(){
        int sum=0;
        for (Employee emp:emps){
            if (emp==null){
                break;
            }
            sum+=emp.getSalary();
            System.out.println(emp);
        }
        return sum;
    }
}
