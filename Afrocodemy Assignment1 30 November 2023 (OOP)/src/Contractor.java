public class Contractor extends Employee {
    private double rate;
    private  int hoursWorked;

    public Contractor(String name){
        this.employeeName = name;
    }
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double calculateSalary(){
        setNetSalary((rate*hoursWorked));
        return getNetSalary();
    }
    public double calculateSalary(double allowance){
        setNetSalary((rate*hoursWorked)+allowance);
        return getNetSalary();
    }
    public void printSalary(){
        System.out.println("{EmployeeName:" +employeeName+", "+
                "Employment Type:Contractor" +", "+
                "Salary:$" + getNetSalary()+".}");
    }
}
