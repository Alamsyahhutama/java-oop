public class ManagerApp {
    public static void main(String[] args) {

        var manager = new Manager("Hutama");
        manager.sayHello("Dikri");

        var vp = new VicePresident("Kukuh");
        vp.sayHello("Al");

        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vp);
        System.out.println(vp.toString());

    }
}
