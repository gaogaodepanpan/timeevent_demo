public class TestException extends RuntimeException{
    private String message;

    public TestException() { }

    public TestException(String message) {
        super(message);
    }
}
