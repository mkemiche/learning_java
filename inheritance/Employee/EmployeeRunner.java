
public class EmployeeRunner {

    public static void main(String[] args) {
        Employee e1 = new Manager(126534, "Peter", "Chennai India", 237844,65000);
        Employee e2 = new Trainee(29846, "Jack", "Mumbai India", 442085, 45000 );

        System.out.println(e1.calculateSalary());
        System.out.println(e2.calculateSalary());
        System.out.println(e1.calculateTransportAllowance());
        System.out.println(e2.calculateTransportAllowance());


    }
}
