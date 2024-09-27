import Student_Manager.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student sv1 = new Student(1, "Vu Quang Chung", 8.0f, 8.5f);
        Student sv2 = new Student(2, "Ngo Ba Kha", 6.5f, 7.5f);

        Student sv3 = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your student code: ");
        int studentCode = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = scanner.nextLine();
        System.out.println("Enter your Practice Point:");
        float practicePoint = scanner.nextFloat();
        System.out.println("Enter your Practice Site: ");
        float practiceSite = scanner.nextFloat();

        sv3.setStudentCode(studentCode);
        sv3.setFullName(fullName);
        sv3.setPracticePoint(practicePoint);
        sv3.setPracticeSite(practiceSite);

        System.out.printf("%-10s %-30s %5s %5s %5s\n", "MSSV", "Họ tên", "Điểm LT", "Điểm TH", "Điểm TB" );
        System.out.println(sv1);
        System.out.println(sv2);
        System.out.println(sv3);


    }
}