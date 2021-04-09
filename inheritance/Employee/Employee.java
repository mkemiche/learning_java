
public abstract class Employee {

    private long employeeId;
    private String employeeName;
    private String employeeAddress;
    private long employeePhone;

    public Employee(long employeeId, String employeeName, String employeeAddress, long employeePhone) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
    }

    public abstract double calculateSalary();

    public abstract double calculateTransportAllowance();
}
