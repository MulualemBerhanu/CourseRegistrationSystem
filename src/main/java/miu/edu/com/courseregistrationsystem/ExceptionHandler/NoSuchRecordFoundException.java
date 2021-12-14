package miu.edu.com.courseregistrationsystem.ExceptionHandler;

public class NoSuchRecordFoundException extends RuntimeException  {
    public NoSuchRecordFoundException(String message) {
        super(message);
    }

    public NoSuchRecordFoundException() {
        this("No record available :(");
    }
}
