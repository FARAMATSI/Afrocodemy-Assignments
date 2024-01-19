public class Employee {
    public String employeeName;
    private double allowances;
    private double netSalary;
    private double salary;
    public double getNetSalary() {
        return netSalary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;
    }
    public void setAllowances(double allowances) {
        this.allowances = allowances;
    }

    public double getAllowances() {
        return allowances;
    }

    double calculateSalary(){
        netSalary = salary + allowances;
        return netSalary;
    }
    public void printSalary(){
        System.out.println("{EmployeeName:" + employeeName +", "+
                "Type_Of Employee:Default Employee" +", "+
                "Salary:$" + netSalary);
    }
}
