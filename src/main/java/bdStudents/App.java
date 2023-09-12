package bdStudents;

import java.util.List;

public class App {
    public static void main(String[] args) {

        StudentDAO studentDAO = new StudentDAO();
        int numberOfRecordsToAdd = 5;
        for (int i = 1; i <= numberOfRecordsToAdd; i++) {
            Student student = new Student("Student " + i, "student" + i );
            studentDAO.addStudent(student);
        }
        System.out.println("All students");
        List<Student> allStudents = studentDAO.getAllStudents();
        for (Student student : allStudents) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Email: " + student.getEmail());
        }
        int studentIdToRetrieve = 1;
        Student retrievedStudent = studentDAO.getStudentById(studentIdToRetrieve);
        if (retrievedStudent != null) {
            System.out.println("\nStudents with ID " + studentIdToRetrieve + ":");
            System.out.println("ID: " + retrievedStudent.getId() + ", Name: " + retrievedStudent.getName() + ", Email: " + retrievedStudent.getEmail());
        } else {
            System.out.println("\nStudents with ID " + studentIdToRetrieve + " not found");
        }

        int studentIdToUpdate = 2;
        Student studentToUpdate = studentDAO.getStudentById(studentIdToUpdate);
        if (studentToUpdate != null) {
            studentToUpdate.setName("NewName");
            studentToUpdate.setEmail("newEmail@example.com");
            studentDAO.updateStudent(studentToUpdate);
            System.out.println("\nChange date in ID " + studentIdToUpdate + ":");
            System.out.println("ID: " + studentToUpdate.getId() + ", Name: " + studentToUpdate.getName() + ", Email: " + studentToUpdate.getEmail());
        } else {
            System.out.println("\nStudents with ID " + studentIdToUpdate + "not found");
        }

        int studentIdToDelete = 3;
        Student studentToDelete = studentDAO.getStudentById(studentIdToDelete);
        if (studentToDelete != null) {
            studentDAO.deleteStudent(studentToDelete);
            System.out.println("\nStudents with ID " + studentIdToDelete + " delete");
        } else {
            System.out.println("\nStudents with ID " + studentIdToDelete + "not found");
        }
    }
}
