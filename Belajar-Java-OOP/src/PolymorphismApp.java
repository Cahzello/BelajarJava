import javax.swing.plaf.ViewportUI;

public class PolymorphismApp {
    public static void main(String[] args) {

        Employee employee = new Employee("Rizky");
        employee.sayHello("Budi");

        employee = new Manager("Rizky", "Tako Tech");
        employee.sayHello("Raka");

        employee = new VicePresident("Rizky");
        employee.sayHello("Ada");

        sayHello(new Employee("Ganisa"));
        sayHello(new Manager("Kucing"));
        sayHello(new VicePresident("Landak"));

    }

    static void sayHello(Employee param){
        System.out.println("hello " + param.name);
    }
}
