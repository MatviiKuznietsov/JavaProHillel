package HW25;

import lombok.Data;

import java.util.Date;

@Data

public class TestResult {
    private int testQuantity;
    private int testSuccessQuantity;
    private int testFailureQuantity;
    private Date date;

}
