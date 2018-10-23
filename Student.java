
/**
 * A class to model a student at university or community college
 *
 * @author Nick Coyle
 * @version 10.23.2018
 */
public class Student
{
    private String firstName;
    private String lastName;
    private String id;
    private double balance;
    private boolean CSC110;
    private boolean CSC142;
    private boolean CSC143;   

    Student(String firstName, String lastName, String id) {
        this(firstName, lastName, id, false, false, false);
    }

    Student(String firstName, String lastName, String id, boolean csc110, boolean csc142, boolean csc143) {
        setFirstName(firstName);
        setLastName(lastName);
        setID(id);
        setCSC110(csc110);
        setCSC142(csc142);
        setCSC143(csc143);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getID() {
        return id;
    }

    public boolean getCSC110() {
        return CSC110;
    }

    public boolean getCSC142() {
        return CSC142;
    }

    public boolean getCSC143() {
        return CSC143;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Student " + firstName + " " + lastName;
    }

    public void setFirstName(String firstName) {
        if(firstName.equals(" ")) {
            throw new IllegalArgumentException("Firstname cannot be blank");
        }
        
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if(lastName.equals(" ")) {
            throw new IllegalArgumentException("lastname cannot be blank");
        }
        
        this.lastName = lastName;
    }

    public void setID(String id) {
        if(id.equals(" ")) {
            throw new IllegalArgumentException("ID cannot be blank");
        } else if (!id.matches("[0-9]{5,}")) {
            throw new IllegalArgumentException("ID is invalid, format must be like 111223333");
        }        
        
        this.id = id;
    }

    public void setCSC110(boolean csc110) {
        this.CSC110 = csc110;
    }

    public void setCSC142(boolean csc142) {
        this.CSC142 = csc142;
    }

    public void setCSC143(boolean csc143) {
        this.CSC143 = csc143;
    }

    public static void test() {
    
    }
}
