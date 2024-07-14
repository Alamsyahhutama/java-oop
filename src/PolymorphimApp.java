public class PolymorphimApp {
    public static void main(String[] args) {
        Employee employee = new Employee("Alamsyah");
        employee.sayHello("Dikri");

        employee = new Manager("Alammsyah");
        employee.sayHello("Dikri");

        employee = new VicePresident("Alamsyah");
        employee.sayHello("Dikri");


        sayHello(new Employee("Alamsyah"));
        sayHello(new Manager("Dikri"));
        sayHello(new VicePresident("Oman"));

    }
    static void sayHello (Employee employee) {
        if(employee instanceof VicePresident ) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello " + employee.name);
        }
    }
}
