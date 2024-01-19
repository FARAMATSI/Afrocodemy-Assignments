public class Manager extends Full_Time{
    private double managerBonus;
    public void setManagerBonus(double managerBonus) {
        this.managerBonus = managerBonus;
    }

    public double getManagerBonus() {
        return managerBonus;
    }
    public Manager(String name) {
        super(name);
    }

    public double calculateSalary(double managerBonus){
        if(getFixedSalary()!=0) {
            setNetSalary(getFixedSalary() + managerBonus);
            return getNetSalary();
        }
        else {
            System.out.println("Please set the Fixed Salary First");
            return 0.0;
        }
    }
    public void printSalary(){
        System.out.println("{EmployeeName: "+employeeName+", "+
                "Employment_Type: Manager" +", "+
                "Manager Bonus:"+getManagerBonus()+", "+
                "Salary:$"+getNetSalary()+".}");
    }
}
