package lab3;

/**
 *
 * @author Instlogin
 */
public class InvalidNameException extends Exception {
    private static final String ERR_MSG =
            "Sorry, you must provide both a first name and a last name. "
            + "Please try again.";
    

    public InvalidNameException(String message, Throwable cause) {
        super(ERR_MSG, cause);
    }

    public InvalidNameException(String message) {
        super(ERR_MSG);
    }

    public InvalidNameException() {
        super(ERR_MSG);
    }


    
}
