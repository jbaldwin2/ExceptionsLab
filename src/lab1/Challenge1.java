package lab1;

import javax.swing.JOptionPane;

/**
 * The purpose of this challenge is to give you practice time using
 * Java Exception handling techniques.
 * <p>
 * Your challenge is to consider all the possible things that can go wrong
 * with this program and use exception handling where appropriate to prevent
 * the program from crashing. In addition you must display a friendly error
 * message in a JOptionPane and ask the user to try again.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class Challenge1 {

    private static final int LAST_NAME_IDX = 1;

    public static void main(String[] args) {
        Challenge1 app = new Challenge1();

        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = app.extractLastName(fullName);
        String msg = "Your last name is: " + lastName;

        if ("Unknown".equals(lastName)) {
            msg = "Unknown last name.";
        }
        JOptionPane.showMessageDialog(null, msg);
    }

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
}
