import java.util.List;

public class Main {
    public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    Student s1 = new Student();
    s1.setFirstName("Murat");
    s1.setLastName("Gül");
    s1.setId(240);
    s1.setGrade(58);

    Student s2 = new Student();
    s2.setFirstName("Ali");
    s2.setLastName("Güler");
    s2.setId(240);
    s2.setGrade(80);

    Student s3 = new Student();
    s3.setFirstName("İdil");
    s3.setLastName("Gül");
    s3.setId(240);
    s3.setGrade(65);

    manager.addStudent(s1);
    manager.addStudent(s2);
    manager.addStudent(s3);

    List<Student> found = manager.getAllStudents();
    List<Student> foundedStudent = StudentUtils.findStudentsByGradeRange(found,58,90);
    StudentUtils.printStudents(foundedStudent);

    }

}