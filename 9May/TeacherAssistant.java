import java.util.concurrent.Semaphore;

package 9May;
public class TeacherAssistant extends Student implements Ifaculty{
    double Salary;
    int exp;
    TeacherAssistant(String Name, double[] SGPA, int Semester){
        super(Name, SGPA, Semester);
    }
}
