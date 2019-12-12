public class Main {

    public static void main(String[] args) {

        Employee Bob = new Employee(1, "Bob", "John", 1200);

        System.out.println(Bob.toString());

        System.out.println("Id: " + Bob.getId());
        System.out.println("First name: " + Bob.getFirstName());
        System.out.println("Last name: " + Bob.getLastName());
        System.out.println("Full name: " + Bob.getName());
        System.out.println("Salary: " + Bob.getSalary());

        Bob.setSalary(1400);
        System.out.println("New salary: " + Bob.getSalary());

        System.out.println("Annual salary: " + Bob.getAnnualSalary());

        Bob.raiseSalary(10);
        System.out.println("Raised salary: " + Bob.getSalary());

        System.out.println(Bob.toString());

    }

}
