
/**
 * A class to model a department at university or community college
 *
 * @author Nick Coyle
 * @version 10.23.2018
 */
public class Department
{
    private int totalStudents;
    private int totalCSC110;
    private int totalCSC142;
    private int totalCSC143;
    private int totalGr110;
    private int totalGr142;
    private int totalGr143;
    private double totalBalance;

    Department() {
        this(0,0,0,0.0);
    }

    Department(int totalStud110, int totalStud142, int totalStud143, double totalBalance) {

    }

    public int getTotalCSC110 () {
        return totalCSC110;   
    }

    public int getTotalCSC142 () {
        return totalCSC142;
    }

    public int getTotalCSC143 () {
        return totalCSC143;
    }

    public double getTotalStudents() {
        return totalStudents;
    }

    public double getTotalBalance() {
        return totalBalance;
    }

    public int getTotalGr110() {
        return totalGr110;
    }

    public int getTotalGr142() {
        return totalGr142;
    }

    public int getTotalGr143() {
        return totalGr143;
    }

    @Override
    public String toString() {
        return "";
    }

    public void addStudent(Student newStudent) {

    }

}
