public class MethodOverloading {
    public static void main(String[] args) {
        sayHello();
        sayHello("Kasumi");
        sayhello("Saaya", "Yamabuki");
    }

    static void sayHello(){
        System.out.println("hello");
    }

    static void sayHello(String name){
        System.out.println("Hello " + name);
    }

    static void sayhello(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
