public class Main {
    public static void main(String[] args) {
        //Creating an Employee of Type Contractor and Calculating and printing the salary
        Contractor contractor = new Contractor("Anesu Kabvura");
        contractor.setRate(10);
        contractor.setHoursWorked(250);
        contractor.calculateSalary();
        contractor.printSalary();

        //Creating an Employee of Type Full_Time and Calculating and printing the salary
        Full_Time fullTime = new Full_Time("Farai Matsika");
        fullTime.setFixedSalary(4000);
        fullTime.calculateSalary();
        fullTime.printSalary();

        //Creating an Employee of Type Manager and Calculating and printing the salary
        Manager manager = new Manager("Leslie Chivhanga");
        manager.setFixedSalary(5000);
        manager.setManagerBonus(500);
        manager.calculateSalary(manager.getManagerBonus());
        manager.printSalary();
    }
}