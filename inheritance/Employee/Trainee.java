
public class Trainee extends Employee{

    private double basicSalary;
    private double specialAllowance;
    private double hra;

    public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone);
        this.basicSalary = basicSalary;
        this.specialAllowance = 250.80;
        this.hra = 1000.50;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + (basicSalary * specialAllowance/100) + (basicSalary * hra/100);
    }

    @Override
    public double calculateTransportAllowance() {
        return 10 * basicSalary/100.0;
    }
}
