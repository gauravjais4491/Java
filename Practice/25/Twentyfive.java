// import java.util.ArrayList;
// import java.util.List;
// import java.util.Map;
// import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;

class Employee{
    String name;
    String job_location;
    Boolean married;
    public Employee(String name, String job_location,Boolean ms)
    {
        this.job_location=job_location;
        this.married=ms;
        this.name=name;
    }
}
public class Twentyfive {
    public static void main(String[] args) {
        // ArrayList<String> filter=new ArrayList<String>();
        // ArrayList<String> filter1=new ArrayList<String>();
        // for (Employee employee : details) {
        //     if(employee.marital_status=="Maried")
        //     {
        //         filter.add(employee.name);
        //     }
        //     else{
        //         filter1.add(employee.name);
        //     }
        // }

        // System.out.println("Married person are:"+filter);
        // System.out.println("UnMarried persons are: "+filter1);
        ArrayList<Employee> details=new ArrayList<Employee>();
        details.add(new Employee("Gaurav Kumar Jaiswal", "delhi",true));
        details.add(new Employee("Mayank Wadhwani", "Mumbai",false));
        details.add(new Employee( "Yash Kumar", "Patna",false));
        details.add(new Employee("Anjali", "UP",false));
        details.add(new Employee("Sandhya", "Bihar",true));
        details.add(new Employee( "Lakshya", "jammu",false));
        details.add(new Employee("netra kashyap", "kolkata",true));
        details.add(new Employee("Bipul jaiswal", "Goa",true));
        details.add(new Employee( "Shruti Ma'am", "Panjab",true));
        Map<String,List<Employee>> mp=details.stream().collect(Collectors.groupingBy(e->e.job_location));
        Set<String> keys=mp.keySet();
        for(String k:keys)
        {
            List<Employee> l =mp.get(k);
            System.out.println("\nEmployee from "+k);
            for(Employee e:l)
            {
                System.out.println("\n"+e.name+"\t"+e.job_location);
            }
        }
        Map<Boolean,List<Employee>> mp1=details.stream().collect(Collectors.partitioningBy(e -> e.married));
        Set <Boolean> ks=mp1.keySet();
        for(Boolean k:ks)
        {
            if(k)
            {
                System.out.println("\n\nMarried Employees are\n");
            }
            else{
                System.out.println("\n\nUnmarried Employees are\n");
            }
            List<Employee>l=mp1.get(k);
            for(Employee e: l)
            {
                System.out.println(e.name+"\t"+e.job_location);
            }
        }
    }
}
