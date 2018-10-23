
/**
 * A class to model a department at university or community college
 *
 * @author Nick Coyle
 * @version 10.23.2018
 */
public class Department
{
    private int totalCSC110;
    private int totalCSC142;
    private int totalCSC143;
        
    private static final double GROUP_SIZE = 28.0; //max 28 students allowed in a group
    private static final double COST_CREDIT = 110.0; //each credit costs $110.00
    private static final int NUM_CREDITS = 5; //each class is worth 5 credits

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
        return totalCSC110 + totalCSC142 + totalCSC143;
    }

    public double getTotalBalance() {
        return getTotalStudents() * NUM_CREDITS * COST_CREDIT;
    }

    public int getTotalGr110() {
        return (int)Math.ceil(totalCSC110 / GROUP_SIZE);
    }

    public int getTotalGr142() {
        return (int)Math.ceil(totalCSC142 / GROUP_SIZE);
    }

    public int getTotalGr143() {
        return (int)Math.ceil(totalCSC143 / GROUP_SIZE);
    }

    @Override
    public String toString() {
        String str = "Total Students Registered: " + getTotalStudents() + "\n";
        str+= "CSC110 Students: " + getTotalCSC110() + "\n";
        str+= "CSC142 Students: " + getTotalCSC142() + "\n";
        str+= "CSC143 Students: " + getTotalCSC143() + "\n";
        str += "Total Balance: " + String.format("%2f", getTotalBalance());
        return str;
    }

    public void addStudent(Student newStudent) {
        //register to CSC110
        if(newStudent.getCSC110() && !(newStudent.getCSC142() || newStudent.getCSC143()) ) {
            ++totalCSC110;
        }
        
         //register to CSC142
        if(newStudent.getCSC142() && !(newStudent.getCSC110() || newStudent.getCSC143()) ) {
            ++totalCSC142;
        }
        
         //register to CSC143
        if(newStudent.getCSC143() && !(newStudent.getCSC110() || newStudent.getCSC142()) ) {
            ++totalCSC143;
        }
        
    }
    
    public static void test() {
    
    }

}
