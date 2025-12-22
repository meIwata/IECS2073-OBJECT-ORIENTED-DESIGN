package java1222;

//public class AgeException extends Exception {
public class AgeException extends RuntimeException { // unchecked exception
    public AgeException(String message) {
        super(message);
    }

}