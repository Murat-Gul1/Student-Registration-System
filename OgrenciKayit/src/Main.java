public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student();

        s1.setFirstName("Murat");

        s1.setId(240);

        s1.setGrade(100);

        s1.setLastName("Gül");

        manager.addStudent(s1);

        System.out.println(manager.findStudentById(240));

        manager.updateStudentById(240,"Hasan","Yeşil",78);

        System.out.println(manager.findStudentById(240));

    }
}