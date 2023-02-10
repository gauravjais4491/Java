import java.util.ArrayList;

public class Twentyone {
    public static void main(String[] args) {
        ArrayList<Student> details=new ArrayList<Student>();
        details.add(new Student(60, "Gaurav Kumar Jaiswal", 7.6f));
        details.add(new Student(61, "Mayank Wadhwani", 8.4f));
        details.add(new Student(62, "Yash Kumar", 6.2f));
        ArrayList<Float> filter=new ArrayList<Float>();
        for(Student student:details)
        {
            if(student.cgpa<7)
            {
                filter.add(student.cgpa);
            }
        }
        System.out.println(filter);

    }
}
class Student{
    int rollNo;
    String name;
    float cgpa;
    public Student(int rollNo,String name,float cgpa)
    {
        this.rollNo=rollNo;
        this.name=name;
        this.cgpa=cgpa;
    }
}
