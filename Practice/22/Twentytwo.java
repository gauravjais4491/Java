import java.util.ArrayList;
class Employee{
    int salary;
    String name;
    String job_location;
    public Employee(int salary,String name,String job_location)
    {
        this.salary=salary;
        this.name=name;
        this.job_location=job_location;
    }
}
public class Twentytwo {
    public static void main(String[] args) {
        ArrayList<Employee> details=new ArrayList<Employee>();
        details.add(new Employee(60000, "Gaurav Kumar Jaiswal", "delhi"));
        details.add(new Employee(67000, "Mayank Wadhwani", "Mumbai"));
        details.add(new Employee(10000, "Yash Kumar", "Banglore"));
        ArrayList<String> filter=new ArrayList<String>();
        for(Employee employee:details)
        {
            if(employee.salary>25000)
            {
                filter.add(employee.name);
            }
        }
        System.out.println(filter);

    }
}
