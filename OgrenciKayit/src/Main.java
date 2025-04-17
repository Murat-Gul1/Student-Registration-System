import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       StudentManager manager = new StudentManager();
       while (true){
           System.out.println("\n===== Student Management Menu =====");
           System.out.println("1. Add Student");
           System.out.println("2. Remove Student by ID");
           System.out.println("3. Update Student by ID");
           System.out.println("4. Find Student by ID");
           System.out.println("5. Sort by Grade (High → Low)");
           System.out.println("6. Sort by Grade (Low → High)");
           System.out.println("7. Filter by Grade Range");
           System.out.println("8. List All Students");
           System.out.println("9. Exit");
           System.out.print("Select an option (1-9): ");

           String choice = scanner.nextLine().trim();
           switch (choice){
               case "1" -> {
                   try {
                       Student s = new Student();
                       System.out.println("First Name: ");
                       s.setFirstName(scanner.nextLine());
                       System.out.println("Last Name: ");
                       s.setLastName(scanner.nextLine());
                       System.out.println("Grade (0-100)");
                       s.setGrade(Double.parseDouble(scanner.nextLine()));
                       manager.addStudent(s);
                       System.out.println("✅ Student added: " + s);
                   }catch (IllegalArgumentException e){
                       System.out.println("❌ Error: " + e.getMessage());
                   }
               }
               case "2" -> {
                   try {
                       System.out.println("Enter ID to remove: ");
                       int id = Integer.parseInt(scanner.nextLine());
                       boolean removed = manager.removeStudentById(id);
                       System.out.println(removed ? "✅ Student removed." : "❌ No student with ID" + id);
                   }catch (NumberFormatException e){
                       System.out.println("❌ ID must be an integer.");
                   }catch (IllegalArgumentException e){
                       System.out.println("ID must be greater than or equal to 240 and positive ↑");
                   }
               }
               case "3" -> {
                   try {
                       System.out.println("Enter ID to update: ");
                       int id = Integer.parseInt(scanner.nextLine());
                       Student existing = manager.findStudentById(id);
                       if(existing == null){
                           System.out.println("❌ No student with ID " + id);
                           break;
                       }
                       System.out.println("\nSelect field to update:");
                       System.out.println("1. First Name");
                       System.out.println("2. Last Name");
                       System.out.println("3. Grade");
                       System.out.println("4. Cancel");
                       System.out.print("Choice (1-4): ");
                       String fieldChoice = scanner.nextLine().trim();
                       switch (fieldChoice) {
                           case "1" -> {
                               System.out.print("New First Name: ");
                               existing.setFirstName(scanner.nextLine());
                               System.out.println("✅ First Name updated to: " + existing.getFirstName());
                           }
                           case "2" -> {
                               System.out.print("New Last Name: ");
                               existing.setLastName(scanner.nextLine());
                               System.out.println("✅ Last Name updated to: " + existing.getLastName());
                           }
                           case "3" -> {
                               System.out.print("New Grade (0-100): ");
                               existing.setGrade(Double.parseDouble(scanner.nextLine()));
                               System.out.println("✅ Grade updated to: " + existing.getGrade());
                           }
                           case "4" -> {
                               System.out.println("⚠️ Update cancelled.");
                           }
                           default -> System.out.println("⚠️ Invalid selection. Returning to main menu.");
                       }
                   }catch (IllegalArgumentException e){
                       System.out.println("❌ Error: " + e.getMessage());
                   }
                   }
               case "8" -> {
                   System.out.println("\n📄 All Students:");
                   StudentUtils.printStudents(manager.getAllStudents());
               }
               case "5" -> {
                   List<Student> list = manager.getAllStudents();
                   StudentUtils.sortStudentsByGradeDesc(list);
                   System.out.println("\n📉 Sorted by Grade (High → Low):");
                   StudentUtils.printStudents(list);
               }
               case "6" -> {
                   List<Student> list = manager.getAllStudents();
                   StudentUtils.sortStudentsByGradeAsc(list);
                   System.out.println("\n📈 Sorted by Grade (Low → High):");
                   StudentUtils.printStudents(list);
               }
               case "7" -> {
                   try {
                       System.out.print("Min Grade: ");
                       double min = Double.parseDouble(scanner.nextLine());
                       System.out.print("Max Grade: ");
                       double max = Double.parseDouble(scanner.nextLine());
                       List<Student> filtered = StudentUtils.findStudentsByGradeRange(manager.getAllStudents(), min, max);
                       System.out.println("\n🎯 Students with grades between " + min + " and " + max + ":");
                       StudentUtils.printStudents(filtered);
                   } catch (NumberFormatException e) {
                       System.out.println("❌ Grades must be numbers.");
                   }
               }
               case "4" -> {
                   try {
                       System.out.println("Enter ID to find: ");
                       int id = Integer.parseInt(scanner.nextLine());
                       Student s = manager.findStudentById(id);
                       System.out.println(s != null ? "🔍 Found: " + s : "❌ No student with ID " + id);
                   }catch (NumberFormatException e){
                       System.out.println("❌ ID must be an integer.");
                   }catch (IllegalArgumentException e){
                       System.out.println("❌ " + e.getMessage());
                   }

               }
               case "9" -> {
                   System.out.println("👋 Goodbye!");
                   scanner.close();
                   return;
               }
               default -> System.out.println("⚠️ Invalid selection, please choose 1-8.");
               }
           }
       }

    }

