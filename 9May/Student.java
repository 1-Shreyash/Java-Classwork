
public class Student implements Istudent{
    String Name;
    // int rollno;
    int Semester;
    double[] SGPA;
    Student(String nm, int Sem, double[] sgpa){
        Name = nm;
        Semester = Sem;
        SGPA = 
    }
    @Override 
    public void CalculateCGPA(){
        double cgpa=0;
        int count =0;
        for (double d : SGPA) {
            cgpa += d;
            count++;
        }
        cgpa /= count;
        System.out.println("Cgpa is"+cgpa);
    }
}
