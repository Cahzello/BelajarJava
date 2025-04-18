public class MethodParameter {
    public static void main(String[] args) {
        sayHello("Rizky", "Rasya");
        sayHello("Kasumi", "Toyama");
    }

    static void sayHello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
