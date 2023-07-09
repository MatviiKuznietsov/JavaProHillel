package HW22DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LessonDao {
    private final Connection connection;

    public LessonDao(Connection connection) {
        this.connection = connection;
    }

    public void addLesson(Lesson lesson)  {
        // INSERT INTO lesson (name1, updateAT )
        // VALUES ("mathPro", "2023-01-23" );
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO lesson (name1, updateAT)\n" +
                    "VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, lesson.getName1());
            statement.setDate(2, (Date) lesson.getUpdatedAt());

            int rows = statement.executeUpdate();

            if (rows == 0) {
                throw new CustomerCreateException("Unable to create customer");
            }
            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                lesson.setId(generatedKeys.getInt(1));
            }

        } catch (SQLException | CustomerCreateException e) {
            throw new RuntimeException(e);
        }
    }

    public void delLesson(String name1) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE FROM lesson WHERE name1=?");
            statement.setString(1, name1);
            statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Lesson> showAllLessons() {
        Statement statement = null;
        List<Lesson> lessons = new ArrayList<>();
        try {
            statement = connection.createStatement();
            boolean dateReturned = statement.execute("SELECT * FROM lesson");
            if (dateReturned) {
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    Lesson lesson = new Lesson();
                    lesson.setId(resultSet.getInt("id"));
                    lesson.setName1(resultSet.getString("name1"));
                    lesson.setUpdatedAt(resultSet.getDate("updateAT"));
                    lesson.setHomework_id(resultSet.getInt("homework_id"));
                    lessons.add(lesson);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return lessons;
    }

    public List<Object> showLessonByID(Integer id) {
        try {
            PreparedStatement statement = connection.prepareStatement("select * from lesson Left join homework on lesson.id= homework.id where lesson.id=?");
            statement.setInt(1, id);
            boolean dateReturned = statement.execute();
            if (dateReturned) {
                ResultSet resultSet = statement.getResultSet();
                List<Object> objects = new ArrayList<>();
                while (resultSet.next()) {
                    Lesson lesson = new Lesson();
                    lesson.setId(resultSet.getInt("id"));
                    lesson.setName1(resultSet.getString("name1"));
                    lesson.setUpdatedAt(resultSet.getDate("updateAT"));
                    lesson.setHomework_id(resultSet.getInt("homework_id"));
                    Homework homework = new Homework();
                    homework.setId(resultSet.getInt("id"));
                    homework.setName1(resultSet.getString("name1"));
                    homework.setDescription(resultSet.getString("description"));
                    objects.add(lesson);
                    objects.add(homework);
                    return objects;
                    //  System.out.printf("Lesson{id=%d; name=%s; updateAt=%s; homework_id:%d}\n", id, name1, updateAT, homeworkId);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public Lesson showLessonByID2(Integer id) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM lesson WHERE id=?");
            statement.setInt(1, id);
            boolean dateReturned = statement.execute();
            if (dateReturned) {
                ResultSet resultSet = statement.getResultSet();
                while (resultSet.next()) {
                    Lesson lesson = new Lesson();
                    lesson.setId(resultSet.getInt("id"));
                    lesson.setName1(resultSet.getString("name1"));
                    lesson.setUpdatedAt(resultSet.getDate("updateAT"));
                    lesson.setHomework_id(resultSet.getInt("homework_id"));
                    return lesson;
                    //  System.out.printf("Lesson{id=%d; name=%s; updateAt=%s; homework_id:%d}\n", id, name1, updateAT, homeworkId);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
