package HW22DB;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class App2 {
    public static void main(String[] args) {
        try (Connection connection = DataBaseConnection.getConnection()) {
            LessonDao lessonDao = new LessonDao(connection);

            Lesson lessonToCreate = new Lesson(); // Create lesson
            lessonToCreate.setName1("mathPro");
            lessonToCreate.setUpdatedAt(Date.valueOf(LocalDate.now()));
            lessonDao.addLesson(lessonToCreate);
            //---------------------------------------------------------------
            for (Lesson lesson : lessonDao.showAllLessons()) { // Show all lesson
                System.out.println(lesson);
            }
            System.out.println();
            //---------------------------------------------------------------
            Object objects = lessonDao.showLessonByID(3); // Show by id lesson
            System.out.println(objects);
            System.out.println();
            //---------------------------------------------------------------
            lessonDao.delLesson("mathPro");

            for (Lesson lesson : lessonDao.showAllLessons()) { // Show all lesson
                System.out.println(lesson);
            }
            System.out.println();
            DataBaseConnection.close(connection); //close connection
        } catch (SQLException e) {
            System.out.println("Unable to create connection " + e.getMessage());
        }
    }
}
