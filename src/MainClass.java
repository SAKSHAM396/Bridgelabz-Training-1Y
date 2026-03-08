import college.student.student;
import college.faculty.faculty;
public class MainClass{
    public static void main(String[] args){
        student s=new student("Rahul",101);
        faculty f=new faculty("Dr Sharma","Java");
        s.display();
        f.display();
    }
}