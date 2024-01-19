public class Full_Time extends Employee{
    private double fixedSalary;
    public  Full_Time(String name){
        this.employeeName = name;
    }
    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public double calculateSalary(){
        if(fixedSalary != 0) {
            setNetSalary(fixedSalary);
            return getNetSalary();
        }
        else {
            System.out.println("Please Set the fixed Salary first");
            return 0.0;
        }
    }
    public double calculateSalary(double allowance){
        if(fixedSalary != 0) {
            setNetSalary((fixedSalary + allowance));
            return getNetSalary();
        }
        else {
            System.out.println("Please Set the fixed Salary first");
            return 0.0;
        }
    }
    public void printSalary(){
        System.out.println("{EmployeeName:"+employeeName+", "+
                "Employment_Type:Full Time" +", "+
                "Salary:$"+getNetSalary()+".}");
    }
}
