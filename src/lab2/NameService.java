package lab2;
import javax.swing.JOptionPane;
/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) {
       String lastName = "Unknown";
        try {

            String[] nameParts = fullName.split(" ");

            int arrayLength = nameParts.length;

            if (arrayLength != 2) {
                // create an exception
                throw new IllegalArgumentException();
            }
            
            lastName = nameParts[LAST_NAME_IDX];

        } catch (NullPointerException iae) {
            // Cancel means quit so lets do it..
            System.exit(0);

            
        } catch (RuntimeException iae) {
            JOptionPane.showMessageDialog(null, "Sorry, only first name and "
                    + "last name are required.  Please try again.");
        }

        return lastName;
    }
    
    
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) {
        String firstName = "Unknown";
        try {

            String[] nameParts = fullName.split(" ");

            int arrayLength = nameParts.length;

            if (arrayLength != 2) {
                // create an exception
                throw new IllegalArgumentException();
            }
            
            firstName = nameParts[FIRST_NAME_IDX];

        } catch (NullPointerException iae) {
            // Cancel means quit so lets do it..
            System.exit(0);

            
        } catch (RuntimeException iae) {
            JOptionPane.showMessageDialog(null, "Sorry, only first name and "
                    + "last name are required.  Please try again.");
        }

        return firstName;
    }
    

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        return name.length();
    }
    
}
