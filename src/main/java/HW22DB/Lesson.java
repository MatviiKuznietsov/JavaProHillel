package HW22DB;

import lombok.Data;

import java.util.Date;

@Data
public class Lesson {
    private Integer id;
    private String name1;
    private Date updatedAt;
    private Integer homework_id;
}
