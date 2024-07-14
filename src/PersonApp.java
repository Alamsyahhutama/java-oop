public class PersonApp {
    public static void main(String[] args) {
        var person1 = new Person("Alamsyah", "Jakarta");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);

        person1.sayHello("Dikri");

        Person person2 = new Person("Andri");

        Person person3;
        person3 = new Person();
        person3.name = "Andi";
        person3.sayHello("Kukuh");
    }
}